import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ToastrModule } from 'ngx-toastr';

import { ScalesModuleComponent } from './components/scales-module/scales-module.component';
import { SelectModuleComponent } from './components/select-module/select-module.component';
import { ArpegioModuleComponent } from './components/arpegio-module/arpegio-module.component';
import { ChordsModuleComponent } from './components/chords-module/chords-module.component';
import { TheoryModuleComponent } from './components/theory-module/theory-module.component';
import { LoginComponent } from './components/auth/login.component';
import { RegisterComponent } from './components/auth/register.component';
import { IndexComponent } from './components/index/index.component';
import { interceptorProvider } from './interceptors/mod-interceptor.service';
import { UserPageComponent } from './components/user-page/user-page.component';

@NgModule({
  declarations: [
    AppComponent,
    ScalesModuleComponent,
    SelectModuleComponent,
    ArpegioModuleComponent,
    ChordsModuleComponent,
    TheoryModuleComponent,
    LoginComponent,
    RegisterComponent,
    IndexComponent,
    UserPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ToastrModule.forRoot()
  ],
  providers: [interceptorProvider],
  bootstrap: [AppComponent]
})
export class AppModule { }
