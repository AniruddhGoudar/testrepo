/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Executives;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bindupagad
 */
public class ExecutiveCasesDirectory {

    List<ExecutiveCases> exeCases;

    public ExecutiveCasesDirectory() {
        exeCases = new ArrayList<>();
    }

    public List<ExecutiveCases> getExecutiveCases() {
        return exeCases;
    }

    public void setExecutiveCases(List<ExecutiveCases> exeCase) {
        this.exeCases = exeCase;
    }

    public void addExecutiveCases(ExecutiveCases exeCase) {
        exeCases.add(exeCase);
    }

    public void removeExecutiveCases(ExecutiveCases exeCase) {
        exeCases.remove(exeCase);
    }

}
