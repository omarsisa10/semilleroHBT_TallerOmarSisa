import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ServiceFacturasService {

  public url: string;

  constructor(
      private _http: HttpClient
  ) {
      this.url = "http://127.0.0.1:8085/semillero-servicios/rest/ServiciosRest/";
  }

  crearFacturas(factura: any) {
      return this._http.post<any>(this.url + 'crearFactura',{body:factura});
  }
  listarFacturas() {
    return this._http.get<any>(this.url + 'consultarTodasFacturasDetalles');
  } 
  
}