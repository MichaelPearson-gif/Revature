import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Card } from '../models/card';

@Injectable({
  providedIn: 'root'
})
export class CardServiceService {

  constructor(private httpClient:HttpClient) { }

  // In Angular, the standard way of handling making Http Requests is by using the HttpClientModule.
  // This contains core classes which allow developers to easily make HTTP requests from Angular applications.
  // There is a type defined within this module known as the HttpClient; this is what we'll use to perform our HTTP requests.
  findAllCards():Observable<Card[]>{
    return this.httpClient.get("http://localhost:8080/ServletReview/api/card/all") as Observable<Card[]>
  }

}
