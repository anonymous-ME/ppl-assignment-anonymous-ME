/*
MIT License

Copyright (c) 2017 Affan Ahmad Fahmi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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

    public Girl(String name, int attractiveness, double maintenance_budget, int intelligence , int happiness ,boolean committed) {
        this.name = name;
        this.attractiveness = attractiveness;
        this.maintenance_budget = maintenance_budget;
        this.intelligence = intelligence;
        this.happiness = happiness;
        this.committed = committed;
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
        this.setHappiness((gift.getValue()*10)+this.getHappiness());
        bf.setHappiness((gift.getValue()*10)+bf.getHappiness());
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

    @Override
    public String toString() {
        return  name + "," + attractiveness + "," + maintenance_budget + "," + intelligence + "," + happiness + "," + false;
    }
    

}
