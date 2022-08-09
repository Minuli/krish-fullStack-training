import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderPlaceComponentComponent } from './order-place-component.component';

describe('OrderPlaceComponentComponent', () => {
  let component: OrderPlaceComponentComponent;
  let fixture: ComponentFixture<OrderPlaceComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrderPlaceComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrderPlaceComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
