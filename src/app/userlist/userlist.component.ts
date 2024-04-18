import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { UserDetails } from '../user-details';


@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent {
  title = 'BusBuddy';

  users: UserDetails[] = [];
  
 
  private getUser() {
    this.service.getUsersList().subscribe((data:any) => {
      this.users = data;});
}
 
  
  
 

  constructor(private service: UserService, private router:Router) { 
  
    this.service.getUsersList().subscribe((data: any) => {
      console.log(data);
    this.users=data;
}); 

}


deleteUser(id: number) {
  this.service.deleteUser(id).subscribe(data =>{
   console.log(data);
    this.getUser();});
}

updateUser(id: number) {
  this.router.navigate(['update-user',id]);
}

userDetails(id:number){
  this.router.navigate(['userdetails',id]);

}

}







