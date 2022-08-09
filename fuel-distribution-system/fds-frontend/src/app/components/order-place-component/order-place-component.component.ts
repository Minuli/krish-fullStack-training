import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-order-place-component',
  templateUrl: './order-place-component.component.html',
  styleUrls: ['./order-place-component.component.scss']
})
export class OrderPlaceComponentComponent implements OnInit {

  private orderId: number = 100;
  public stationName ='';
  public fuelType: string = '';
  public fuelQuantity: string = '';
  public orderUrl = 'http://localhost:8080/order';
  public fuelTypes = [
    {viewValue: 'Diesel', value: 'diesel'},
    {viewValue: 'Super Diesel', value: 'super diesel'},
    {viewValue: 'Petrol 95', value: 'petrol 95'},
    {viewValue: 'Petrol 92', value: 'petrol 92'}
  ];
  public quantities = [
    {viewValue: '3300', value: 3300},
    {viewValue: '6600', value: 6600},
    {viewValue: '13200', value: 13200}
  ];
  constructor( private http:HttpClient) { }



  ngOnInit(): void {
  }

  public getValues(): void
  {
    this.orderId = Math.floor(Math.random()*10000);

    const data = {
      id : this.orderId,
      station_name : this.stationName,
      type : this.fuelType,
      no_of_litres : this.fuelQuantity
    }

    console.log(this.orderId + " "+this.stationName + " "+ this.fuelType +" "+ this.fuelQuantity +" " );
    this.http.post(this.orderUrl,data)
    .subscribe((result)=>{
      console.warn("result",result)

    })
  }






}
