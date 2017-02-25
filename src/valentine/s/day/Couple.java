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
public class Couple implements Comparable<Couple>{
    
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
    
    public void startGifting(){
        getGf().takeGift(getBf().giveGift());
    }

    public int getHappiness() {
        return (bf.getHappiness()+gf.getHappiness());
    }
    @Override
    public String toString(){
        return gf.getName()+"<-->"+bf.getName();
    }

    @Override
    public int compareTo(Couple o) {
        return o.getHappiness() < this.getHappiness() ? -1 : 1;
    }
    
    
}