/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Executives;

import Business.UserAccountManagement.UserAccount;

/**
 *
 * @author bindupagad
 */
public class ExecutiveCases {

    String carId;
    UserAccount agentAcc;
    String status; // In Process, On Hold, Ready to Sell, Sold 
    String comments;

    public ExecutiveCases(String carId, UserAccount agentAcc) {
        this.carId = carId;
        this.agentAcc = agentAcc;
        this.status = "In Process";
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public UserAccount getAgentAcc() {
        return agentAcc;
    }

    public void setAgentAcc(UserAccount agentAcc) {
        this.agentAcc = agentAcc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
