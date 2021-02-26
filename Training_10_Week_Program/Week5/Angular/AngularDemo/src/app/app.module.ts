import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardComponent } from './components/card/card.component';
import { BannerComponent } from './components/banner/banner.component';
import { FormsModule } from '@angular/forms';
import { ColorCodeDirective } from './directives/color-code.directive';
import { PunctuationPipe } from './pipes/PunctuationPipe';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CardComponent,
    BannerComponent,
    ColorCodeDirective,
    PunctuationPipe,
    HttpClientModule
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
