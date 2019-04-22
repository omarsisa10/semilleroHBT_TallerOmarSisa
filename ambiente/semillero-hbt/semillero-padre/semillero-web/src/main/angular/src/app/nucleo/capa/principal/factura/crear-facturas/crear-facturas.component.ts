import { Component, OnInit } from '@angular/core';
import { facturaDTO } from '../../apoyo/modelo/facturaDTO';
import { facturaDetalleDTO } from '../../apoyo/modelo/facturaDetalleDTO';
import { ServiceFacturasService } from 'src/app/services/facturas/service-facturas.service';

@Component({
  selector: 'app-crear-facturas',
  templateUrl: './crear-facturas.component.html'
})
export class CrearFacturasComponent implements OnInit {
  public header: string = 'Crear Facturas';
  public facturaDetalle: facturaDetalleDTO= null; 

  constructor(private ServiceFacturasService: ServiceFacturasService) { }

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
    var facturaPost = this.facturaDetalle;
    this.ServiceFacturasService.crearFacturas(facturaPost).subscribe(
      vehiculoCreado => {
        this.limpiarFactura();
      },
      error => {
        console.log(error);
      }
    );  
  }
  public limpiarFactura() {
    this.facturaDetalle = {
      detalleId:'0',
      factura:'',
      plato: '',
      bebida: '',
      precioUnitario:0
    }
  }

}
