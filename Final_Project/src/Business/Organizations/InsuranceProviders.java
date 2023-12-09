/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

/**
 *
 * @author Anirudh Goudar
 */
public class InsuranceProviders {
    private static int uID = 0;
    String insuranceName;
    String accidentaldamagePrice;
    String theftPrice;
    String roadAssistancePrice;
    String premimumPMPrice;
    String premimumAnnualPrice;
    String uniqueId;
    String addedToCatalog;
    
    
    public InsuranceProviders(String insuranceName,  String accidentaldamagePrice,
    String theftPrice, String roadAssistancePrice, String premimumPMPrice,
    String premimumAnnualPrice, String addedToCatalog){
         this.uniqueId = generateUniqueId();
        this.insuranceName = insuranceName;
        this.accidentaldamagePrice = accidentaldamagePrice;
        this.theftPrice = theftPrice;
        this.roadAssistancePrice = roadAssistancePrice;
        this.premimumPMPrice = premimumPMPrice;
        this.premimumAnnualPrice = premimumAnnualPrice;
        this.addedToCatalog = addedToCatalog;
                    
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
   
    public String getAccidentaldamagePrice() {
        return accidentaldamagePrice;
    }

    public void setAccidentaldamagePrice(String accidentaldamagePrice) {
        this.accidentaldamagePrice = accidentaldamagePrice;
    }
    
    public String getTheftPrice() {
        return theftPrice;
    }

    public void setTheftPrice(String theftPrice) {
        this.theftPrice = theftPrice;
    }

    public String getRoadAssistancePrice() {
        return roadAssistancePrice;
    }

    public void setRoadAssistancePrice(String roadAssistancePrice) {
        this.roadAssistancePrice = roadAssistancePrice;
    }
    
    public String getPremimumPMPrice() {
        return premimumPMPrice;
    }

    public void setPremimumPMPrice(String premimumPMPrice) {
        this.premimumPMPrice = premimumPMPrice;
    }

    public String getPremimumAnnualPrice() {
        return premimumAnnualPrice;
    }

    public void setPremimumAnnualPrice(String premimumAnnualPrice) {
        this.premimumAnnualPrice = premimumAnnualPrice;
    }

    public String getAddedToCatalog() {
        return addedToCatalog;
    }

    public void setAddedToCatalog(String addedToCatalog) {
        this.addedToCatalog = addedToCatalog;
    }

    private String generateUniqueId() {
        uID++; // Increment the counter
        String paddedCounter = String.format("%03d", uID);
        // Format as three-digit number with leading zeros
            return "Insurance_" + paddedCounter;
    }
          
    
    
    
}
