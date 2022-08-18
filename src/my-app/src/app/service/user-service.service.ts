import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import { Observable } from 'rxjs/internal/Observable';

@Injectable()

export class UserService {

  private usersUrl: string;

  headers= new HttpHeaders();

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users';
    this.headers=this.headers.set('content-type','application/json')
    this.headers=this.headers.set('Access-Control-Allow-Origin', '*');
  }

  public findAll(): Observable<User[]> {
    console.log("calling get...",this.headers);
    return this.http.get<User[]>(this.usersUrl, { 'headers': this.headers });
  }

  public save(user: User) {
    return this.http.post<User>(this.usersUrl, user, { 'headers': this.headers });
  }
}