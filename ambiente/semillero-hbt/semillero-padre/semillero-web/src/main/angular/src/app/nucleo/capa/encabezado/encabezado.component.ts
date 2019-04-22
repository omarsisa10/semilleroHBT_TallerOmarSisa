import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html'
})
export class EncabezadoComponent implements OnInit {
  public title = "Taller Final Semillero HBT 2019";
  constructor() { }

  ngOnInit() {
  }

}
