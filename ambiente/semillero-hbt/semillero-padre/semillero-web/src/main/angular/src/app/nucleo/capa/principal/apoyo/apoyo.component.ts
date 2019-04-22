import { Component, OnInit } from '@angular/core';
import { personaDTO } from './modelo/personaDTO';
import { from } from 'rxjs';
import { ServiceFacturaService } from 'src/app/services/pruebas/service-factura.service';

@Component({
  selector: 'app-apoyo',
  templateUrl: './apoyo.component.html',
  providers: [ServiceFacturaService]
})

export class ApoyoComponent implements OnInit {
  public listaClientes= [];

  constructor(private _services:ServiceFacturaService) { 
  }

  ngOnInit() {
    this._services.listarClientes().subscribe(result=>{
     // console.log(result);
      this.listaClientes=result;

    }) 
  }
}
