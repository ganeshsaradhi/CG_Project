import { Component, OnInit } from '@angular/core';
import { BookserviceService } from '../bookservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-users',
  templateUrl: './show-users.component.html',
  styleUrls: ['./show-users.component.css']
})
export class ShowUsersComponent implements OnInit {

  usersInfo;
  constructor(private bookService: BookserviceService, private router: Router) {
    this.getUserDetails();
  }

  ngOnInit(): void {
  }

  getUserDetails() {
    this.bookService.getUserData().subscribe(response => {
      console.log(response);
      this.usersInfo = response.usersInfo;
    }, error => {
      console.log(error);
    }
    );
  }

}
