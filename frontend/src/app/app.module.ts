import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AutomovelComponent } from './manter/automovel/automovel.component';
import { ProprietarioListComponent } from './listar/proprietario-list/proprietario-list.component';
import { CorreioListComponent } from './listar/correio-list/correio-list.component';
import { MoradorListComponent } from './listar/morador-list/morador-list.component';
import { AlertMessageComponent } from './shared/components/alert-message/alert-message.component';
import { VisitanteComponent } from './manter/visitante/visitante.component';
import { MyLoaderComponent } from './shared/components/my-loader/my-loader.component';
import { ConfirmMessageComponent } from './shared/components/confirm-message/confirm-message.component';
import { MessageService } from './shared/services/messages/message.service';
import { TokenStorageService } from './shared/services/token-storage/token-storage.service';
import { LoaderService } from './shared/services/loader.service';
import { authInterceptorProviders } from './shared/providers/auth.interceptor';
import { loaderInterceptorProviders } from './shared/providers/loader.interceptor.service';

@NgModule({
  declarations: [
    AppComponent,
    AutomovelComponent,
    ProprietarioListComponent,
    CorreioListComponent,
    MoradorListComponent,
    AlertMessageComponent,
    VisitanteComponent,
    MyLoaderComponent,
    ConfirmMessageComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [
    MessageService,
    TokenStorageService,
    LoaderService,
    authInterceptorProviders,
    loaderInterceptorProviders
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
