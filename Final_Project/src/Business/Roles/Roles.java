/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business;
import Business.UserAccountManagement.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author bindupagad
 */
public abstract class Roles {

    public static Roles Admin;
    public static Roles Executive;
    public static Roles Customer;
    public static Roles ServicePOC;
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Business business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public enum TypeOfRole {

        Admin("Admin"),
        Executive("Executive"),
        Customer("Customer"),
        ServicePointOfContact("ServicePOC");

        private String value;

        private TypeOfRole(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
