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
    private int intelligence;
    private boolean committed = false;
    private int happiness;
    private Boy bf;
    ArrayList<Gift> gifts =new ArrayList<>();
    
    //Intl. level
    public static final int CHOOSY = 0;
    public static final int NORMAL = 1;
    public static final int DESPERATE = 2;

    public Girl(String name, int attractiveness, double maintenance_budget, int intelligence , int happiness ,boolean committed , Boy bf) {
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        if(intelligence>2 | intelligence<0)
            this.intelligence = -1;
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
    
    void takeGift(Gift gift){
        gifts.add(gift);
        this.setHappiness(gift.getValue()*10);
        bf.setHappiness(gift.getValue()*10); // Giving Happiness to BF
        this.setMaintenance_budget(this.getMaintenance_budget()-gift.getValue());
        bf.setBudget(bf.getBudget() - gift.getValue());
    }
    
    Boolean isDateble(Boy bf){
        if(bf.getBudget() < this.getMaintenance_budget())
            return false;
        else
            return true;
    }
    
    void startDating(Boy bf){
        bf.setGf(this);
        this.setBf(bf);
        this.setCommitted(true);
    }
    
    void breakUP(){
        bf.setGf(null);
        bf.setCommitted(false);
        
        this.setBf(null);
        this.setCommitted(false);
    }

}
