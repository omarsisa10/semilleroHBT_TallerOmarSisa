import { Injectable, Injector } from '@angular/core';
import { clienteDTO } from 'src/app/nucleo/capa/principal/apoyo/modelo/clienteDTO';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceClienteService {
  
  public cliente: clienteDTO;
  public clientes: clienteDTO[];

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
