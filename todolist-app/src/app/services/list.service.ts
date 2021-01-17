import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Util } from '../util/util';
import { ListModel } from '../model/list-model';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class ListService {
    util: Util = new Util();
    list: ListModel;

    constructor(private httpClient: HttpClient) { }


    createList() {
        return this.httpClient.post<ListModel>(this.util.baseURL + 'lists', JSON.stringify(this.list))
            .pipe(catchError(error => {
                return throwError(error);
            }));
    }

    deleteList() {
        return this.httpClient.delete<ListModel>(this.util.baseURL + 'lists/' + JSON.stringify(this.list.id))
            .pipe(catchError(error => {
                return throwError(error);
            }));
    }

}