package com.ticketbooking.Bus.Buddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ticketbooking.Bus.Buddy.Model.Signup1;


public interface FirstRepo extends JpaRepository  < Signup1, Integer> {
     Signup1 findByEmail(String email);


     
}
