import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardComponent } from './components/card/card.component';
import { BannerComponent } from './components/banner/banner.component';
import { FormsModule } from '@angular/forms';
import { ColorCodeDirective } from './directives/color-code.directive';
import { PunctuationPipe } from './pipes/PunctuationPipe';
import { HttpClientModule } from '@angular/common/http';
import { CardDetailsComponent } from './components/card-details/card-details.component';
import { CanActivateCards, MockAuthService } from './auth/CanActivateCards';

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    BannerComponent,
    ColorCodeDirective,
    PunctuationPipe,
    HttpClientModule,
    CardDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CanActivateCards, MockAuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
