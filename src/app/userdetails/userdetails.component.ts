import { Component, OnInit } from '@angular/core';
import { UserDetails } from '../user-details';
import { ActivatedRoute } from '@angular/router';
import { UserService } from '../user.service';


@Component({
  selector: 'app-userdetails',
  templateUrl: './userdetails.component.html',
  styleUrls: ['./userdetails.component.css']
})



export class UserdetailsComponent implements OnInit {

  id!: number 

  user!: UserDetails

  constructor(private route: ActivatedRoute, private userService: UserService ) { }

  ngOnInit(): void {
     this.id = this.route.snapshot.params['id'];
     this.user = new UserDetails();

     this.userService.getUserById(this.id).subscribe( data => {
          this.user = data;
         });

  }


}

  


