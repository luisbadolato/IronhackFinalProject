import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ArpegioModuleComponent } from './components/arpegio-module/arpegio-module.component';
import { LoginComponent } from './components/auth/login.component';
import { RegisterComponent } from './components/auth/register.component';
import { ChordsModuleComponent } from './components/chords-module/chords-module.component';
import { IndexComponent } from './components/index/index.component';
import { ScalesModuleComponent } from './components/scales-module/scales-module.component';
import { SelectModuleComponent } from './components/select-module/select-module.component';
import { TheoryModuleComponent } from './components/theory-module/theory-module.component';
import { UserPageComponent } from './components/user-page/user-page.component';

const routes: Routes = [
  { path: '', component: IndexComponent},
  { path: 'modules', component: SelectModuleComponent},
  { path: 'login', component: LoginComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'arpeggios', component: ArpegioModuleComponent},
  { path: 'chords', component: ChordsModuleComponent},
  { path: 'scales', component: ScalesModuleComponent},
  { path: 'theory', component: TheoryModuleComponent},
  { path: 'user', component: UserPageComponent},
  { path: '**', redirectTo: '', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {  }
