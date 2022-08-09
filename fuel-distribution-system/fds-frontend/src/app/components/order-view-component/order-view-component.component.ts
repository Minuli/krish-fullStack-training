import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-order-view-component',
  templateUrl: './order-view-component.component.html',
  styleUrls: ['./order-view-component.component.scss']
})
export class OrderViewComponentComponent implements OnInit {

  public orderFetchUrl = 'http://localhost:8080/orders';
  public dataSource:any;
  displayedColumns: string[] = ['demo-position', 'demo-name', 'demo-weight', 'demo-symbol'];

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.getAllOrders();
  }

  public getAllOrders(): void
  {
    this.http.get(this.orderFetchUrl).subscribe((result:any)=>
    {
      if(result){
        this.dataSource = [...result];
      }
    })
  }



}
