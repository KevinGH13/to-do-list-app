import { Component, OnInit } from '@angular/core';
import { TodolistService } from '../../services/todolist.service';
import { Util } from '../../util/util';
import { Router } from '@angular/router';
import { TaskService } from 'src/app/services/task.service';
import { ListService } from 'src/app/services/list.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  listTodolist: any[] = [];
  util: Util = new Util();

  constructor(private todolistService: TodolistService, private taskService: TaskService, private listService: ListService, private router: Router) {
    this.getTodolist();
  }

  ngOnInit() {
  }

  getTodolist() {
    this.todolistService.getTodolist()
      .subscribe(response => {
        console.log(response)
        this.listTodolist = Object.values(response);
      })
  }

  createList() {
    this.listService.createList()
      .subscribe(response => {
        console.log(response)
        console.log("Lista creada");
      })
  }

  createTask() {
    this.taskService.createList()
      .subscribe(response => {
        console.log("Lista creada");
      })
  }

}
