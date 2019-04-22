import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-consultar-facturas',
  templateUrl: './consultar-facturas.component.html'
})
export class ConsultarFacturasComponent implements OnInit {
  public header: string = 'Consultar Facturas';
  public columnas: string[]= ["precioUnitario","Plato", "bebibda","factura","iva","total","cliente","acción"];
  
  constructor() { }

  ngOnInit() {
  }

}
