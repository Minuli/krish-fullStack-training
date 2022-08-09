import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatTabsModule} from '@angular/material/tabs';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {MatTableModule} from '@angular/material/table';

const materialComponents = [
  MatTabsModule,
  MatFormFieldModule,
  MatSelectModule,
  MatInputModule,
  MatButtonModule,
  MatTableModule

];
@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    materialComponents
  ],
  exports: [
    materialComponents
  ]
})
export class MaterialModule { }
