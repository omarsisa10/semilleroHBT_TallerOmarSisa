import { Component, OnInit } from '@angular/core';
import { ServiceFacturaService } from 'src/app/services/service-factura.service';

@Component({
  selector: 'app-consultar-factura',
  templateUrl: './consultar-factura.component.html',
  styleUrls: ['./consultar-factura.component.css'],
  providers: [ServiceFacturaService]
})

export class ConsultarFacturaComponent implements OnInit {
public listaClientes= [];

  constructor(private _services:ServiceFacturaService) { 
  }

  ngOnInit() {
    this._services.listarClientes().subscribe(result=>{
      console.log(result);
      this.listaClientes=result;

    }) 
  }
  
}
