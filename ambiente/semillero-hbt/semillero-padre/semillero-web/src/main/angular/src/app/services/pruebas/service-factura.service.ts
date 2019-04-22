import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ServiceFacturaService {

  public url: string;

  constructor(
      private _http: HttpClient
  ) {
      this.url = "http://127.0.0.1:8085/semillero-servicios/rest/ServiciosRest/";
  }

  listarClientes() {
      return this._http.get<any>(this.url + 'consultarClientes');
  }
}