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
public class Boy {
    private String name;
    private int attractiveness;
    private String intelligence;
    public double budget;
    private boolean committed = false;
    private int happiness;
    private Girl gf;
    ArrayList<Gift> gifts =new ArrayList<Gift>();

    public Boy(String name, int attractiveness, String intelligence, double budget, int happiness ,boolean committed , Girl gf) {
        this.name = name;
        this.attractiveness = attractiveness;
        this.intelligence = intelligence;
        this.budget = budget;
        this.happiness = happiness;
        this.committed = committed;
        this.gf = gf;
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

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
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
    
    public Girl getGf() {
        return gf;
    }

    public void setGf(Girl gf) {
        this.gf = gf;
    }
    
    //Functions




    
    
}
