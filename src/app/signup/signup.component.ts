import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  
  user: any = {
    username: '',
    email: '',
    age: '',
    gender: '',
    contact: '',
    password: ''
  };

  // Injected dependency of UserService and Router
  constructor(private userService: UserService, private router: Router) {}

  submitForm() {
    this.userService.createUser(this.user).subscribe(
      (response: any) => {
        console.log(response);
        this.router.navigate(['/login']);
        // Optionally, you can navigate to another page or perform additional actions after a successful response.
        // Example: this.router.navigate(['/dashboard']);
      },
      (error: any) => {
        console.error(error);
        // Handle error scenarios if needed.
      }
    );
  }

}
   


  

