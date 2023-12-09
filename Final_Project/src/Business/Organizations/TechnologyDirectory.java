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
public class TechnologyDirectory {
    
    List<Technology> techList;
      
      
    public TechnologyDirectory() {
        techList = new ArrayList<>();
    }

    public List<Technology> getTechnologies() {
        return techList;
    }

    public void setTechnologies(List<Technology> tech) {
        this.techList = tech;
    }
    
    public void addTechnologies(Technology tech){
        techList.add(tech);
    }
    
    public void removeTechnologies(Technology tech){
        techList.remove(tech);
    }
    
}
