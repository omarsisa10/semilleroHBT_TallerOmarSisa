import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-crear-clientes',
  templateUrl: './crear-clientes.component.html'
})
export class CrearClientesComponent implements OnInit {
  public header: string = 'Crear Clientes';
  constructor() { }

  ngOnInit() {
  }

}
