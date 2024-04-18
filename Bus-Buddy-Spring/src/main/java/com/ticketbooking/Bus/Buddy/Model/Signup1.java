package com.ticketbooking.Bus.Buddy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Signup_users")
public class Signup1 {

    public Signup1() {
    }

    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id

    private int id;
    private String username;
    private String email;
    private String age;
    private String gender;
    private String contact;
    private String password;
    private String oldPassword;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getOldPassword() {
        return oldPassword;
    }
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
    @Override
    public String toString() {
        return "Signup1 [id=" + id + ", username=" + username + ", email=" + email + ", age=" + age + ", gender="
                + gender + ", contact=" + contact + ", password=" + password + ", oldPassword=" + oldPassword + "]";
    }

    

}