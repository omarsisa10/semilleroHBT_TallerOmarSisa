import { Component, OnInit } from '@angular/core';
import { ServiceClienteService } from 'src/app/services/clientes/service-cliente.service';

@Component({
  selector: 'app-consultar-clientes',
  templateUrl: './consultar-clientes.component.html',
  providers: [ServiceClienteService]
})
export class ConsultarClientesComponent implements OnInit {
  public header: string = 'Consultar Clientes';
  public columnas: string[]= ["idCliente","Nombres","acción"];
  public listaClientes= [];

  constructor(private _services:ServiceClienteService) { 
  }

  ngOnInit() {
    this._services.listarClientes().subscribe(result=>{
     // console.log(result);
      this.listaClientes=result;

    }) 
  }

}
