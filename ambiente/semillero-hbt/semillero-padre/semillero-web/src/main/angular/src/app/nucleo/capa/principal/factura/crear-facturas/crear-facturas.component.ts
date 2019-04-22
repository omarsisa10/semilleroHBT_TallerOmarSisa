import { Component, OnInit } from '@angular/core';
import { facturaDTO } from '../../apoyo/modelo/facturaDTO';

@Component({
  selector: 'app-crear-facturas',
  templateUrl: './crear-facturas.component.html'
})
export class CrearFacturasComponent implements OnInit {
  public header: string = 'Crear Facturas';
  public factura: facturaDTO= null; 

  constructor() { }

  ngOnInit() {
    this.factura = {
      facturaId:0,
      cliente: {clienteId:0, clienteNombre:''},
      iva: 0,
      total:0
    }
  }
  guardar(){
    debugger
  }

}
