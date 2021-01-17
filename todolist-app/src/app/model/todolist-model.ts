import { TaskModel } from "./task-model";

export interface TodolistModel {
    idList: string;
    nameList: string;
    complete: string;
    tasks: TaskModel;
}