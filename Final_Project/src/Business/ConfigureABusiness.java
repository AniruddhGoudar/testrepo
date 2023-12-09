/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Customers.CustomersSeller;
import Business.Customers.CustomersSellerDirectory;
import Business.Organizations.InsuranaceProvidersDirectory;
import Business.Organizations.InsuranceProviders;
import Business.Organizations.Technology;
import Business.Organizations.TechnologyDirectory;
import Business.Roles.Roles;
import Business.User.User;
import Business.UserAccountManagement.UserAccountDirectory;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author bindupagad
 */
public class ConfigureABusiness {
    
    ImageIcon logoImage;

    public static Business initialize() {

        Business business = new Business("Rental Car System");
        UserAccountDirectory userAccDirectory = business.getUserAccDirectory();
        InsuranaceProvidersDirectory insuranceProviderDirectory = business.getInsuranceDirectory();
        TechnologyDirectory techDirectory = business.getTechnologyDirectory();
        CustomersSellerDirectory custSellerDirectory = business.getCustomersSellerDirectory();

        User adminUser = new User("System", "Admin", "sys@gmail.com", "4567890987", "sys", "admin", "Admin");
        userAccDirectory.addAccount(adminUser);
        
        User customerUser = new User("Customer", "1", "cust1@gmail.com", "4567890987", "cust1", "cust1", "Customer");
        userAccDirectory.addAccount(customerUser);
        
        User executiveUser = new User("Executive", "1", "exe1@gmail.com", "4567890987", "exe", "exe", "Executive");
        userAccDirectory.addAccount(executiveUser);
        
        System.out.println("userAccount system"+business.getUserAccDirectory().getUserAccList().size());
        
        InsuranceProviders i1 = new InsuranceProviders("American Dream", "$300", "$250", "400", "$30", "$3000", "No");
        insuranceProviderDirectory.addInsuranceProviders(i1);
        
        InsuranceProviders i2 = new InsuranceProviders("Good Stone", "$300", "$250", "400", "$30", "$3000","No");
        insuranceProviderDirectory.addInsuranceProviders(i2);
        
        InsuranceProviders i3 = new InsuranceProviders("Complete Warranty", "$300", "$250", "400", "$30", "$3000","No");
        insuranceProviderDirectory.addInsuranceProviders(i3);
        
        InsuranceProviders i4 = new InsuranceProviders("Endurance", "$300", "$250", "400", "$30", "$3000", "No");
        insuranceProviderDirectory.addInsuranceProviders(i4);
        
        InsuranceProviders i5 = new InsuranceProviders("Liberty Mutual", "$300", "$250", "400", "$30", "$3000","No");
        insuranceProviderDirectory.addInsuranceProviders(i5);
        
        InsuranceProviders i6 = new InsuranceProviders("MAPFRE", "$300", "$250", "400", "$30", "$3000","No");
        insuranceProviderDirectory.addInsuranceProviders(i6);
        
        Technology t1 = new Technology("GPS Tracking","$5000","No");
        techDirectory.addTechnologies(t1);
        
        Technology t2 = new Technology("Apple Car Play","$8000","No");
        techDirectory.addTechnologies(t2);
        
        Technology t3 = new Technology("Apple Car Play","$11000","No");
        techDirectory.addTechnologies(t3);
        
        Technology t4 = new Technology("Adas System","$15000","No");
        techDirectory.addTechnologies(t4);
        
        CustomersSeller c1 = new CustomersSeller("Kia Carnival", "2023", "3700", "Disel","Automatic", "0", "Kia",customerUser,"50000");
        c1.setSet("Sold");
        custSellerDirectory.addCustomersSeller(c1);
        
        return business;
    }

}
