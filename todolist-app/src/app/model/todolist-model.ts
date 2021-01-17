import { taskModel } from "./task-model";

export interface TodolistModel {
    idList: string;
    nameList: string;
    complete: string;
    tasks: taskModel;
}