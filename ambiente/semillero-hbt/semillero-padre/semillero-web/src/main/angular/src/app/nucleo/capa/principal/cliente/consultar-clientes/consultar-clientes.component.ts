import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-consultar-clientes',
  templateUrl: './consultar-clientes.component.html'
})
export class ConsultarClientesComponent implements OnInit {
  public header: string = 'Consultar Clientes';
  public columnas: string[]= ["idCliente","Nombres","acción"];
  constructor() { }

  ngOnInit() {
  }

}
