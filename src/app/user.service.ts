
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';
import { UserDetails } from './user-details';


@Injectable({
  providedIn: 'root'

})
export class UserService {


  private url = "http://localhost:8080/api/v1/allUsers";
  private baseUrl = "http://localhost:8080/api/v1";




  constructor(private http: HttpClient) { }

  getApi() {
    return this.http.get(this.url);

  }

  getUsersList() {
    return this.http.get(this.url);

  }


  createUser(user: UserDetails): Observable<object> {
    return this.http.post(`${this.baseUrl}/register`, user);
  }



  deleteUser(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/register/${id}`);
  }


  updateUser(id: number, user: UserDetails): Observable<Object> {
    return this.http.put(`${this.baseUrl}/register/${id}`, user);
  }

  getUserById(id: number): Observable<UserDetails> {
    return this.http.get<UserDetails>(`${this.baseUrl}/register/${id}`);
  }
}






