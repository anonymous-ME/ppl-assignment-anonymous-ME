/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valentine.s.day;

/**
 *
 * @author affan
 */
public class Boy {
    private String name;
    private int attractiveness;
    private int intelligence;
    public double budget;
    private boolean committed = false;
    private int happiness;
    private Girl gf;
    private int giftCount = 0;
    
    //Intl. level
    public static final int MISER = 0;
    public static final int GENEROUS = 1;
    public static final int GEEKS = 2;
    
    public Boy(String name, int attractiveness, int intelligence, double budget, int happiness ,boolean committed , Girl gf) {
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
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
    private Boolean isInBudget(Gift gift){
        if(gift.getValue() <= budget)
            return true;
        else 
            return false;
    } 

    void giveGift(){
        if(this.getIntelligence() == Boy.GENEROUS)
            switch (gf.getIntelligence()) {
                case Girl.CHOOSY:
                    if(isInBudget(new Gift(Gift.LUXURY)))
                        gf.takeGift(new Gift(Gift.LUXURY));
                    else if(isInBudget(new Gift(Gift.UTILITY)))
                        gf.takeGift(new Gift(Gift.UTILITY));
                    else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        gf.takeGift(new Gift(Gift.ESSENTIAL));
                    break;
                case Girl.NORMAL:
                    if(isInBudget(new Gift(Gift.UTILITY)))
                        gf.takeGift(new Gift(Gift.UTILITY));
                    else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        gf.takeGift(new Gift(Gift.ESSENTIAL));
                    break;
                case Girl.DESPERATE:   
                    if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        gf.takeGift(new Gift(Gift.ESSENTIAL));
                    break;
                default:
                    break;
            }
        else if(this.getIntelligence() == Boy.MISER)
            if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        gf.takeGift(new Gift(Gift.ESSENTIAL));
        else if(this.getIntelligence() == Boy.GEEKS){
            if(giftCount % 3 == 0)
                if(isInBudget(new Gift(Gift.LUXURY)))
                    gf.takeGift(new Gift(Gift.LUXURY));
                else if(isInBudget(new Gift(Gift.UTILITY)))
                    gf.takeGift(new Gift(Gift.UTILITY));
                else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                    gf.takeGift(new Gift(Gift.ESSENTIAL));
            else
                if(isInBudget(new Gift(Gift.UTILITY)))
                    gf.takeGift(new Gift(Gift.UTILITY));
                else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                    gf.takeGift(new Gift(Gift.ESSENTIAL));
        }
        giftCount++;
    }
}