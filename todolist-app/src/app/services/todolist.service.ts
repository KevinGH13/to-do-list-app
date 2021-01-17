import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Util } from '../util/util';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { TodolistModel } from '../model/todolist-model';

@Injectable({
    providedIn: 'root'
})
export class TodolistService {
    util: Util = new Util();
    constructor(private httpClient: HttpClient) { }

    buildModelTodolist(todolistModel: any) {
        return {
            IdList: todolistModel.idList,
            NameList: todolistModel.nameList,
            Status: todolistModel.complete,
            Tasks: todolistModel.tasks
        };
    }

    getTodolist(): Observable<TodolistModel> {
        return this.httpClient.get<TodolistModel>(this.util.baseURL)
            .pipe(catchError(error => {
                return throwError(error);
            }));
    }

}