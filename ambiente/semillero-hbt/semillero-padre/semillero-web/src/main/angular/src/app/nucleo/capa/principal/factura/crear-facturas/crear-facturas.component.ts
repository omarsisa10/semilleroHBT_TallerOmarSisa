import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-crear-facturas',
  templateUrl: './crear-facturas.component.html'
})
export class CrearFacturasComponent implements OnInit {
  public header: string = 'Crear Facturas';
  constructor() { }

  ngOnInit() {
  }

}
