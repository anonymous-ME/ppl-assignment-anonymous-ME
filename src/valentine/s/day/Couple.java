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
public class Couple {
    
    private Boy bf;
    private Girl gf;
    

    public Couple(Boy bf, Girl gf) {
        this.bf = bf;
        this.gf = gf;
    }

    public Boy getBf() {
        return bf;
    }

    public void setBf(Boy bf) {
        this.bf = bf;
    }

    public Girl getGf() {
        return gf;
    }

    public void setGf(Girl gf) {
        this.gf = gf;
    }

    public int getHappiness() {
        return (bf.getHappiness()+gf.getHappiness());
    }
    
}