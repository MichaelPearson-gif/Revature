// The classes present inside of this file will be used to determine the criteria for accessing certain route(s).

import { Injectable } from "@angular/core";
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot} from "@angular/router";

export class MockAuthService{
    canActivate(user:string, password:string){
        return false;
    }
}

@Injectable()
export class CanActivateCards implements CanActivate{

    constructor(private auth:MockAuthService){

    }

    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): boolean{
        // What do I return here?
        return this.auth.canActivate('Michael', 'password');
    }
    
}