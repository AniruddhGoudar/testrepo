/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

/**
 *
 * @author Anirudh Goudar
 */
public class Technology {
    
    String technologyName;
    String technologyPrice;
    String addedToCatalog;
//    String gpsTrackingPrice;
//    String appleCarPlayPrice;
//    String memorySeatsPrice;
//    String adasPrice;
    
    public Technology( String technologyName, String technologyPrice, String addedToCatalog){
        this.technologyName = technologyName;
        this.technologyPrice = technologyPrice;
        this.addedToCatalog = addedToCatalog;
        
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getTechnologyPrice() {
        return technologyPrice;
    }

    public void setTechnologyPrice(String technologyPrice) {
        this.technologyPrice = technologyPrice;
    }

    public String getAddedToCatalog() {
        return addedToCatalog;
    }

    public void setAddedToCatalog(String addedToCatalog) {
        this.addedToCatalog = addedToCatalog;
    }

    
}
