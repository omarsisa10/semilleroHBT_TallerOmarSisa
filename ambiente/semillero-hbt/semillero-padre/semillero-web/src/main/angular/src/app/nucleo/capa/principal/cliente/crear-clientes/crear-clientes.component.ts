import { Component, OnInit } from '@angular/core';
import { clienteDTO } from '../../apoyo/modelo/clienteDTO';
import { ServiceClienteService } from 'src/app/services/clientes/service-cliente.service';

@Component({
  selector: 'app-crear-clientes',
  templateUrl: './crear-clientes.component.html'
})
export class CrearClientesComponent implements OnInit {
  public cliente: clienteDTO= null; 
  public header: string = 'Crear Clientes';
 

  constructor(private clientesService: ServiceClienteService) { }

  ngOnInit() {
    this.cliente = {
      clienteId:0,
      clienteNombre:''  
    }  
  }
  public limpiarCliente() {
    this.cliente = {
      clienteId:0,
    clienteNombre:' ' 
    };
  }
  guardar(){
    var clientePost = this.cliente.clienteNombre;
    this.clientesService.crearClientes(clientePost).subscribe(
      vehiculoCreado => {
        this.limpiarCliente();
      },
      error => {
        console.log(error);
      }
    );
    
    
  }

}
