import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderViewComponentComponent } from './order-view-component.component';

describe('OrderViewComponentComponent', () => {
  let component: OrderViewComponentComponent;
  let fixture: ComponentFixture<OrderViewComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrderViewComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrderViewComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
