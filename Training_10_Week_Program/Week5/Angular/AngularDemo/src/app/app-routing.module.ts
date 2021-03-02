import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CanActivateCards } from './auth/CanActivateCards';
import { CardComponent } from './components/card/card.component';

const routes: Routes = [
  {
    path: "cards",
    component: CardComponent,
    canActivate: [CanActivateCards]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
