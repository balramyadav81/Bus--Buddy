import { Component, OnInit } from '@angular/core';
import { UserDetails } from '../user-details';
import { UserService } from '../user.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class  UpdateUserComponent implements OnInit {


  id!: number;
  user: UserDetails = new UserDetails();
 constructor(private userService: UserService,
    private route: ActivatedRoute,
    private router: Router) { }
  
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.userService.getUserById(this.id).subscribe(data => {
      this.user = data;
    }, error => console.log(error));
  }
 onSubmit() {
    this.userService.updateUser(this.id, this.user).subscribe( data =>{
      this.goToUserList();
    }
    , error => console.log(error));
 }
  goToUserList(){
    this.router.navigate(['/userlist']);
  }
}

