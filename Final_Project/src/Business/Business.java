/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Customers.CustomersBuyerDirectory;
import Business.Customers.CustomersSellerDirectory;
import Business.Executives.ExecutiveCasesDirectory;
import Business.Organizations.InsuranaceProvidersDirectory;
import Business.Organizations.TechnologyDirectory;
import Business.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author bindupagad
 */
public class Business {

    private final String name;
    private UserAccountDirectory userAccDirectory;
    private InsuranaceProvidersDirectory insuranceDirectory;
    private TechnologyDirectory techDirectory;
    private CustomersSellerDirectory custSellerDirectory;
    private ExecutiveCasesDirectory exeCasesDirectory;
    private CustomersBuyerDirectory custBuyerDirectory;

    public Business(String name) {
        this.name = name;

        userAccDirectory = new UserAccountDirectory();
        insuranceDirectory = new InsuranaceProvidersDirectory();
        techDirectory = new TechnologyDirectory();
        custSellerDirectory = new CustomersSellerDirectory();
        exeCasesDirectory = new ExecutiveCasesDirectory();
        custBuyerDirectory = new CustomersBuyerDirectory();
    }

    public UserAccountDirectory getUserAccDirectory() {
        return userAccDirectory;
    }

    public InsuranaceProvidersDirectory getInsuranceDirectory() {
        return insuranceDirectory;
    }

    public TechnologyDirectory getTechnologyDirectory() {
        return techDirectory;
    }

    public CustomersSellerDirectory getCustomersSellerDirectory() {
        return custSellerDirectory;
    }

    public ExecutiveCasesDirectory getExeCasesDirectory() {
        return exeCasesDirectory;
    }

    public CustomersBuyerDirectory getCustBuyerDirectory() {
        return custBuyerDirectory;
    }

}
