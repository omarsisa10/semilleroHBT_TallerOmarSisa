import { Component, OnInit } from '@angular/core';
import { facturaDTO } from '../../apoyo/modelo/facturaDTO';
import { facturaDetalleDTO } from '../../apoyo/modelo/facturaDetalleDTO';

@Component({
  selector: 'app-crear-facturas',
  templateUrl: './crear-facturas.component.html'
})
export class CrearFacturasComponent implements OnInit {
  public header: string = 'Crear Facturas';
  public facturaDetalle: facturaDetalleDTO= null; 

  constructor() { }

  ngOnInit() {
    this.facturaDetalle = {
      detalleId:'0',
      factura:'',
      plato: '',
      bebida: '',
      precioUnitario:0
    }
  }
  guardar(){
    debugger
  }

}
