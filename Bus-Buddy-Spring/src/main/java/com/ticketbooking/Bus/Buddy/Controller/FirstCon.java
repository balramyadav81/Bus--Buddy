package com.ticketbooking.Bus.Buddy.Controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbooking.Bus.Buddy.Model.Signup1;
import com.ticketbooking.Bus.Buddy.Service.ServiceSignupIMPL;

// @Controller
@RestController
@RequestMapping("/api/v1/")
@CrossOrigin (origins ="http://localhost:4200")
public class FirstCon {
    @Autowired
    ServiceSignupIMPL service;

    @GetMapping("/index")
    public String indexx() {
        return "index";
    }

    @GetMapping("/signup")
    public String signupp() {
        return "signup";
    }
  
    
    @PostMapping("/register")
    public Signup1 registertologin(@RequestBody Signup1 user) {
        service.addUser(user);
        // service.deleteuser(a);
        System.out.println(user);
        System.out.println("user registered");
        // return service.addUser(user);
        return user;}

    @GetMapping("/login")
    public String loginn() {   
        return "login";
    }

    @GetMapping("/booking")
    public String booking() {
        return "booking";
    }


    @GetMapping("/about")
    public String aboutt() {
        return "about";
    }

    @GetMapping("/contact")
    public String contactt() {  
        return "contact";
    }
     
    @GetMapping("/updatePassword")
    public String updatePassword() {
        return "updatePassword";
    }

    @DeleteMapping("/register/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int id) {
        Signup1 user = (Signup1) service.getUserById(id);
        //   .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));

        service.deleteUser(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);}

   

  

        @GetMapping("/register/{id}")
	public ResponseEntity<Signup1> getEmployeeById(@PathVariable int id) {
		Signup1 user = service.getUserById(id);
				// .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(user);
	}
    
        @GetMapping("/getUseremail/{email}")
        public String getUseremail(@PathVariable String email, Model model) {
            Signup1 usersemail = service.getUserByEmail(email);
            System.out.println(usersemail);
            return "index";
    
        }


        @PutMapping("/register/{id}")
	public ResponseEntity<Signup1> updateEmployee(@PathVariable int id, @RequestBody Signup1 userDetails){
		Signup1 user = service.getUserById(id);
				// .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		user.setUsername(userDetails.getUsername());
		user.setGender(userDetails.getGender());
		user.setEmail(userDetails.getEmail());
		user.setContact(userDetails.getContact());
        user.setPassword(userDetails.getPassword());
		 Signup1 updatedUser = service.save(user);
		return ResponseEntity.ok(updatedUser);
	}

   


     @GetMapping("/allUsers")
     @ResponseBody
     public List<Signup1> showAllUsers() {
        return service.getAllSignup();
    }




     @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        Signup1 user = service.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            // User is valid, you can set a session variable to remember the user's login state if needed
            System.out.println("login successful");
            return "dashboard"; // Redirect to the dashboard page on successful login
        } else {
            model.addAttribute("error", "Invalid email or password. Please try again.");
            System.out.println("login failed");
            return "login"; // Stay on the login page with an error message
        }
    }
}



    
      
 
 
    
