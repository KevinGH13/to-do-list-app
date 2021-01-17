import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Util } from '../util/util';
import { ListModel } from '../model/list-model';

@Injectable({
    providedIn: 'root'
})
export class ListService {
    util: Util = new Util();
    list: ListModel;

    constructor(private httpClient: HttpClient) { }


    createList() {
        console.log(this.httpClient.post<ListModel>(this.util.baseURL + 'lists', this.list));
        return this.httpClient.post<ListModel>(this.util.baseURL + 'lists', this.list);
    }

    deleteList() {
        return this.httpClient.delete<ListModel>(this.util.baseURL + 'lists/' + this.list.id);
    }

}