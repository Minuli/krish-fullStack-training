public class WaterDrippingClass {

    static Array filter;
    static Array data;

    WaterDrippingClass(int x, int y) {
        filter = new Array(x, y);
        data = new Array(x, y);
    }

    public static class Array {
        double[][] data;
        int width;
        int height;

        Array(int x, int y) {
            width = x;
            height = y;
            data = new double[height][width];
        }

    }

    public void printFilter() {
        if (this.data != null && this.filter != null) {
            for (int i = 0; i < this.filter.height; i++) {
                System.out.print("  ");
                for (int j = 0; j < this.filter.width; j++) {
                    System.out.print((int) this.filter.data[i][j] + " ");
                }
                System.out.print("|\t");
                for (int j = 0; j < this.data.width; j++) {
                    System.out.print(this.data.data[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No data");
        }
    }

    public void removeHoles(int x, int y) {
        if (this.data != null && this.filter != null) {
            this.filter.data[this.filter.height - y][x - 1] = 1;
        } else {
            System.out.println("No data");
        }
    }

    public void addWater(int x) {
        if (this.data != null && this.filter != null) {
            this.data.data[0][x - 1] = 100;
        } else {
            System.out.println("No data");
        }
    }

    public double drainWater() {
        if (this.data != null && this.filter != null) {
            this.printFilter();
            System.out.println("---------------------------------------------");
            for (int i = 0; i < this.filter.height - 1; i++) {
                for (int j = 0; j < this.filter.width; j++) {
                    if (this.data.data[i][j] != 0) {
                        if (this.filter.data[i][j] != 0 || this.filter.data[i + 1][j] != 0) {
                            if (j - 1 >= 0)
                                this.data.data[i + 1][j - 1] += this.data.data[i][j] / 2;
                            if (j + 1 < this.filter.width)
                                this.data.data[i + 1][j + 1] += this.data.data[i][j] / 2;
                        } else {
                            this.data.data[i + 1][j] += this.data.data[i][j];
                        }
                        this.data.data[i][j] = 0;
                    }
                }
                this.printFilter();
                System.out.println("---------------------------------------------");
            }

            double sum = 0;
            for (int j = 0; j < this.filter.width; j++) {
                if (this.data.data[this.filter.height - 1][j] != 0) {
                    if (this.filter.data[this.filter.height - 1][j] != 0) {
                        if (j - 1 >= 0)
                            sum += this.data.data[this.filter.height - 1][j] / 2;
                        if (j + 1 < this.filter.width)
                            sum += this.data.data[this.filter.height - 1][j] / 2;
                    } else {
                        sum += this.data.data[this.filter.height - 1][j];
                    }
                }
            }
            return sum;

        } else {
            System.out.println("No data");
            return 0;
        }
    }

    public static void main(String[] args) {
        WaterDrippingClass waterDripping = new WaterDrippingClass(7, 7);

        // Configure filter
        waterDripping.removeHoles(1, 3);
        waterDripping.removeHoles(1, 6);
        waterDripping.removeHoles(2, 3);
        waterDripping.removeHoles(3, 3);
        waterDripping.removeHoles(3, 5);
        waterDripping.removeHoles(4, 5);
        waterDripping.removeHoles(5, 5);
        waterDripping.removeHoles(6, 3);
        waterDripping.removeHoles(7, 2);
        waterDripping.addWater(4);

        double remainingWater = waterDripping.drainWater();
        System.out.println("---------------------------------------------");

        System.out.println();
        System.out.println("Remaining water: " + remainingWater);

    }
}
