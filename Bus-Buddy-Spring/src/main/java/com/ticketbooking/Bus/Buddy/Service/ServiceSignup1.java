package com.ticketbooking.Bus.Buddy.Service;


import java.util.List;

import com.ticketbooking.Bus.Buddy.Model.Signup1;

public interface ServiceSignup1 {

    public Signup1 addUser( Signup1 signup1);

    // public void deleteUser(int id);

    public Signup1 deleteUser(Signup1 user);  //signup 1 model name 

    public Signup1 getUserById(int id);
    public Signup1 getUserByEmail(String email);
    public Signup1 updateUser(Signup1 signup1);
    
    public List<Signup1> getAllSignup();
    
    Signup1 save(Signup1 user);
}
    
    
    

    
    

