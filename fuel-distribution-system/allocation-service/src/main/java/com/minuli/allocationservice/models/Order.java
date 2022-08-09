package com.minuli.allocationservice.models;

public class Order {

    private Integer Id;
    private String station_name;
    private String type;
    private int no_of_litres;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public int getNo_of_litres() {
        return no_of_litres;
    }

    public void setNo_of_litres(int no_of_litres) {
        this.no_of_litres = no_of_litres;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
