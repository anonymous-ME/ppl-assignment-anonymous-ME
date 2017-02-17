/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine.s.day;

import java.util.ArrayList;

/**
 *
 * @author affan
 */

public class Girl {
    private String name;
    private int attractiveness;
    private double maintenance_budget;
    private String intelligence;
    private boolean committed = false;
    private int happiness;
    private Boy bf;
    ArrayList<Gift> gifts =new ArrayList<Gift>();

    public Girl(String name, int attractiveness, double maintenance_budget, String intelligence , int happiness ,boolean committed , Boy bf) {
        this.name = name;
        this.attractiveness = attractiveness;
        this.maintenance_budget = maintenance_budget;
        this.intelligence = intelligence;
        this.happiness = happiness;
        this.committed = committed;
        this.bf = bf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttractiveness() {
        return attractiveness;
    }

    public void setAttractiveness(int attractiveness) {
        this.attractiveness = attractiveness;
    }

    public double getMaintenance_budget() {
        return maintenance_budget;
    }

    public void setMaintenance_budget(double maintenance_budget) {
        this.maintenance_budget = maintenance_budget;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }
    
    public boolean isCommitted() {
        return committed;
    }

    public void setCommitted(boolean committed) {
        this.committed = committed;
    }
    
    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    
    public Boy getBf() {
        return bf;
    }

    public void setBf(Boy bf) {
        this.bf = bf;
    }
    
    //Functions


}
