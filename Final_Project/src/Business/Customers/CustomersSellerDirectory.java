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
public class CustomersSellerDirectory {
    List<CustomersSeller> custSeller;
      
      
    public CustomersSellerDirectory() {
        custSeller = new ArrayList<>();
    }

    public List<CustomersSeller> getCustomersSeller() {
        return custSeller;
    }

    public void setCustomersSeller(List<CustomersSeller> customerSeller) {
        this.custSeller = customerSeller;
    }
    
    public void addCustomersSeller(CustomersSeller customerSeller){
        custSeller.add(customerSeller);
    }
    
    public void removeCustomersSeller(CustomersSeller customerSeller){
        custSeller.remove(customerSeller);
    }
}
