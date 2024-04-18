/* package com.ticketbooking.Bus.Buddy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booking_users")

public class Booking1 {

   
    @GeneratedValue( ) 
    @Id
    
    private int id;
    @Column
    private String bus_Type;
    private String source;
    private String destination;
    private String date;
   
    private String name;
    private String gender;
    private String age;
    

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getBus_Type() {
        return bus_Type;
    }


    public void setBus_Type(String bus_Type) {
        this.bus_Type = bus_Type;
    }


    public String getSource() {
        return source;
    }


    public void setSource(String source) {
        this.source = source;
    }


    public String getDestination() {
        return destination;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getAge() {
        return age;
    }


    public void setAge(String age) {
        this.age = age;
    }


    public Booking1() {
    }


    @Override
    public String toString() {
        return "Booking1 [id=" + id + ", bus_Type=" + bus_Type + ", source=" + source + ", destination=" + destination
                + ", date=" + date + ",  name=" + name + ", gender=" + gender + ", age="
                + age + "]";
    }
    
  

}
 */