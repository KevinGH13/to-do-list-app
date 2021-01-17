import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

// Components
import { HomeComponent } from './components/home/home.component';
import { ListService } from './services/list.service';
import { TaskService } from './services/task.service';
import { TodolistService } from './services/todolist.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
    ListService,
    TaskService,
    TodolistService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
