import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Util } from '../util/util';
import { TaskModel } from "../model/task-model";

@Injectable({
    providedIn: 'root'
})
export class TaskService {
    util: Util = new Util();
    task: TaskModel;

    constructor(private httpClient: HttpClient) { }


    createList() {
        return this.httpClient.post<TaskModel>(this.util.baseURL + '/task', this.task);
    }

    deleteList() {
        return this.httpClient.delete<TaskModel>(this.util.baseURL + '/task/' + this.task.id);
    }

}