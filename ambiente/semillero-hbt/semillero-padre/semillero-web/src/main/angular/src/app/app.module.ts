import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { APP_BASE_HREF } from '@angular/common';
import { ConsultarFacturaComponent } from './nucleo/principal/factura/consultar-factura/consultar-factura.component';

@NgModule({
  declarations: [
    AppComponent,
    ConsultarFacturaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    HttpClientModule
  ],
  providers: [
  	{ provide: APP_BASE_HREF, useValue: '/SemilleroHBT' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
