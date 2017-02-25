/*
MIT License

Copyright (c) 2017 Affan Ahmad Fahmi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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
    
    public Boy(String name, int attractiveness, double budget, int intelligence, int happiness , boolean committed) {
        this.name = name;
        this.attractiveness = attractiveness;
        this.intelligence = intelligence;
        this.budget = budget;
        this.happiness = happiness;
        this.committed = committed;
        //this.gf = gf;
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
    
    public Gift giveGift(){
        if(this.getIntelligence() == Boy.GENEROUS)
            switch (gf.getIntelligence()) {
                case Girl.CHOOSY:
                    if(isInBudget(new Gift(Gift.LUXURY)))
                        return (new Gift(Gift.LUXURY));
                    else if(isInBudget(new Gift(Gift.UTILITY)))
                        return (new Gift(Gift.UTILITY));
                    else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        return (new Gift(Gift.ESSENTIAL));
                    break;
                case Girl.NORMAL:
                    if(isInBudget(new Gift(Gift.UTILITY)))
                        return (new Gift(Gift.UTILITY));
                    else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        return (new Gift(Gift.ESSENTIAL));
                    break;
                case Girl.DESPERATE:   
                    if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        return (new Gift(Gift.ESSENTIAL));
                    break;
                default:
                    break;
            }
        else if(this.getIntelligence() == Boy.MISER)
            if(isInBudget(new Gift(Gift.ESSENTIAL)))
                        return (new Gift(Gift.ESSENTIAL));
        else if(this.getIntelligence() == Boy.GEEKS){
            if(giftCount % 3 == 0)
                if(isInBudget(new Gift(Gift.LUXURY)))
                    return (new Gift(Gift.LUXURY));
                else if(isInBudget(new Gift(Gift.UTILITY)))
                    return (new Gift(Gift.UTILITY));
                else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                    return (new Gift(Gift.ESSENTIAL));
            else
                if(isInBudget(new Gift(Gift.UTILITY)))
                    return (new Gift(Gift.UTILITY));
                else if(isInBudget(new Gift(Gift.ESSENTIAL)))
                    return (new Gift(Gift.ESSENTIAL));
            giftCount++;
        }
        //Going to debt
        return (new Gift(Gift.ESSENTIAL));
    }
    
    @Override
    public String toString() {
        return  name + "," + attractiveness + "," + budget + "," + intelligence + "," + happiness + "," + false;
    }
}