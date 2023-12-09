/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anirudh Goudar
 */
public class InsuranaceProvidersDirectory {
      List<InsuranceProviders> insuranceProviders;
      
      
    public InsuranaceProvidersDirectory() {
        insuranceProviders = new ArrayList<>();
    }

    public List<InsuranceProviders> getInsuranceProviders() {
        return insuranceProviders;
    }

    public void setInsuranceProviders(List<InsuranceProviders> insProviders) {
        this.insuranceProviders = insProviders;
    }
    
    public void addInsuranceProviders(InsuranceProviders insProviders){
        insuranceProviders.add(insProviders);
    }
    
    public void removeInsuranceProviders(InsuranceProviders insProviders){
        insuranceProviders.remove(insProviders);
    }
}
