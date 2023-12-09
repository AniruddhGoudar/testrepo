/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bindupagad
 */
public class CustomersBuyerDirectory {
    
    List<CustomersBuyer> custBuyer;
      
      
    public CustomersBuyerDirectory() {
        custBuyer = new ArrayList<>();
    }

    public List<CustomersBuyer> getCustomersBuyer() {
        return custBuyer;
    }

    public void setCustomersBuyer(List<CustomersBuyer> customerBuyer) {
        this.custBuyer = customerBuyer;
    }
    
    public void addCustomersBuyer(CustomersBuyer customerBuyer){
        custBuyer.add(customerBuyer);
    }
    
    public void removeCustomersBuyer(CustomersBuyer customerBuyer){
        custBuyer.remove(customerBuyer);
    }
    
}
