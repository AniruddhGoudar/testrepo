/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import Business.Roles.Roles;
import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author bindupagad
 */
public class User extends UserAccount {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String userId;
    private String password;
    private String role;
    
    public User(){
        
    }

    public User(String firstName, String lastName, String email, String phoneNumber, String userId, String password, String role) {
        setUsername(userId);
        setPwd(password);
        setRole(role);
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
        this.password = password;
        this.role = role;
      
       // this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }  
    
       
}
