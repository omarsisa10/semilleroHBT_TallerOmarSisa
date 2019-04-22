import { Component, OnInit } from '@angular/core';
import { ServiceFacturasService } from 'src/app/services/facturas/service-facturas.service';

@Component({
  selector: 'app-consultar-facturas',
  templateUrl: './consultar-facturas.component.html'
})
export class ConsultarFacturasComponent implements OnInit {
  public header: string = 'Consultar Facturas';
  public columnas: string[]= ["precioUnitario","Plato", "bebibda","factura","iva","total","cliente","acción"];
  public listaFacturas= [];
  constructor(private _services:ServiceFacturasService) { 
  }

  ngOnInit() {
    this._services.listarFacturas().subscribe(result=>{
     // console.log(result);
      this.listaFacturas=result;

    }) 
  }

}
