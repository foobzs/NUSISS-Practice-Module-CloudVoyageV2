import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { API_BASE_URL } from '../../app.config';
import config from '../../../../auth_config.json';
import { testApi } from 'src/app/models/testApi.model';
@Injectable({
  providedIn: 'root',
})
export class ApiService {
  private apiUrl = `${API_BASE_URL}/api/hello`; 
  
  constructor(private http: HttpClient) {}

  ping$() {
    return this.http.get(`${config.apiUri}/api/external`);
  }

  testEndpoint(): Observable<testApi> {
    //console.log("TESTING API URL " + this.apiUrl);
    return this.http.get<testApi>(this.apiUrl);
  }
}
