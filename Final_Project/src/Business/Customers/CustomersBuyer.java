/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customers;

import Business.UserAccountManagement.UserAccount;
import javax.swing.ImageIcon;

/**
 *
 * @author bindupagad
 */
public class CustomersBuyer {
    
    String carModel;
    String manufacteryear;
    String kmsDriven;
    String fuelType;
    String transmission;
    String noOfAccidents;
    String carCompany;
    String type; 
    String uniqueId;
    UserAccount sellerAcc;
    String sellingPrice;
    String status;

    private ImageIcon logoImage;

    public CustomersBuyer(String carModel, String manufacteryear, String milesDriven,
            String fuelType, String transmission, String carCompany, 
            UserAccount sellerAcc, String sellingPrice, String carId, String type, String status) {
        this.carModel = carModel;
        this.manufacteryear = manufacteryear;
        this.kmsDriven = milesDriven;
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.carCompany = carCompany;
        this.type = type;
        this.uniqueId = carId;
        this.sellerAcc = sellerAcc;
        this.sellingPrice = sellingPrice;
        this.status = status;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getManufacteryear() {
        return manufacteryear;
    }

    public void setManufacteryear(String manufacteryear) {
        this.manufacteryear = manufacteryear;
    }

    public String getKmsDriven() {
        return kmsDriven;
    }

    public void setKmsDriven(String kmsDriven) {
        this.kmsDriven = kmsDriven;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getNoOfAccidents() {
        return noOfAccidents;
    }

    public void setNoOfAccidents(String noOfAccidents) {
        this.noOfAccidents = noOfAccidents;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getType() {
        return type;
    }

    public void setSet(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return carCompany;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;

    }
    
    public UserAccount getSellerAcc() {
        return sellerAcc;
    }

    public void setSellerAcc(UserAccount sellerAcc) {
        this.sellerAcc = sellerAcc;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    
}
