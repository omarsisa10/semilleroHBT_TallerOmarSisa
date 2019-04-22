import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ApoyoComponent } from './nucleo/capa/principal/apoyo/apoyo.component';

import { ConsultarClientesComponent } from './nucleo/capa/principal/cliente/consultar-clientes/consultar-clientes.component';
import { CrearClientesComponent } from './nucleo/capa/principal/cliente/crear-clientes/crear-clientes.component';
import { ConsultarFacturasComponent } from './nucleo/capa/principal/factura/consultar-facturas/consultar-facturas.component';
import { CrearFacturasComponent } from './nucleo/capa/principal/factura/crear-facturas/crear-facturas.component';

const routes: Routes = [
	
	{path: 'componente-apoyo',component: ApoyoComponent},
	{path: 'consultar-clientes', component: ConsultarClientesComponent},
	{path: 'crear-clientes', component: CrearClientesComponent},
	{path: 'consultar-facturas', component: ConsultarFacturasComponent},
	{path: 'crear-facturas', component: CrearFacturasComponent}
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
export class AppRoutingModule { }
