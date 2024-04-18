import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { BookingComponent } from './booking/booking.component';
import { AboutComponent } from './about/about.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { UserlistComponent } from './userlist/userlist.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UserdetailsComponent } from './userdetails/userdetails.component';


const routes: Routes = [


 

  {
    component: UserdetailsComponent,
    path: 'userdetails/:id'
  },
  
  {
    component: UpdateUserComponent,
     path: 'update-user/:id'
  },
  

  { path: '', redirectTo: 'home', pathMatch:'full' },

  {
    component:UpdateUserComponent,
    path:'update-user'
  },

  {
    component:HomeComponent,
    path:'home'
  }, 

  {
    component:UserlistComponent,
    path:'userlist'
  },
  {
    component:NavbarComponent,
    path:'navbar'
  },


  {
    component:LoginComponent,
    path:'login'
  },
  {
    component:SignupComponent,
    path:'signup'
  },

  {
    component:BookingComponent,
    path:'booking'
  },

  {
    component:AboutComponent,
    path:'about'
  },

  {
    component:ContactComponent,
    path:'contact'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
