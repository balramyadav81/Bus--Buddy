package com.ticketbooking.Bus.Buddy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbooking.Bus.Buddy.Model.Signup1;
import com.ticketbooking.Bus.Buddy.Repository.FirstRepo;

@Service
public class ServiceSignupIMPL implements ServiceSignup1 {
        @Autowired
        FirstRepo obj;

        @Override
        public Signup1 addUser(Signup1 user) {
                return obj.save(user);

        }

        // @Override
        // public void deleteUser(int id) {
        //         obj.deleteById(id);

        // }

        @Override
        public List<Signup1> getAllSignup() {
                return obj.findAll();
        }

        @Override
        public Signup1 getUserById(int id) {
                return obj.findById(id).orElse(null);

        }

        @Override
        public Signup1 getUserByEmail(String email) {
                return obj.findByEmail(email);

        }


        

        @Override
        public Signup1 deleteUser(Signup1 user) {
                obj.deleteById(user.getId()); // Assuming UserDetails has a getId method
        return user;
        }

       
@Override
public Signup1 save(Signup1 user) {
    return obj.save(user);}

        @Override
public Signup1 updateUser(Signup1 user) {
    Signup1 existingUser = obj.findByEmail(user.getEmail());
    
    if (existingUser != null) {
        existingUser.setUsername(user.getUsername());
       
        existingUser.setGender(user.getGender());
         existingUser.setContact(user.getContact());
        existingUser.setEmail(user.getEmail());
        existingUser.setAge(user.getAge());
        existingUser.setPassword(user.getPassword());
        existingUser.setOldPassword(user.getPassword());


        // Update other fields as needed

        return obj.save(existingUser);
    }
    
    return null; // Or throw an exception if required
}
}


