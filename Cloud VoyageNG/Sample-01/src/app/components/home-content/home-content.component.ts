import { Component, ViewEncapsulation, OnInit } from '@angular/core';
import { faLink } from '@fortawesome/free-solid-svg-icons';
import { testApi } from 'src/app/models/testApi.model';
import { ApiService } from './home-content.service';
@Component({
  selector: 'app-home-content',
  templateUrl: './home-content.component.html',
  styleUrls: ['./assets/css/style.css'],
  encapsulation: ViewEncapsulation.None
  //'./home-content.component.css',
})
export class HomeContentComponent implements OnInit{
  constructor(private api: ApiService) {}
  faLink = faLink;
  message: testApi;
  ngOnInit() {
    this.testApiEndpoint();
  }

  testApiEndpoint(){
    this.api.testEndpoint().subscribe(
      (res) => {
        console.log('RESPONSE', res);
        this.message = res;
      },
      (error) =>{
        console.error('Error in api test endpoint', error);
      }
    )
  };
}
