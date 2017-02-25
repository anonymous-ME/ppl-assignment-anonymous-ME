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
public class Gift {
  
    String [] types = {"Essential","Luxury","Utility"};
    private int type;
    
    //Gift Types
    public static final int ESSENTIAL = 0;
    public static final int LUXURY = 1; 
    public static final int UTILITY = 2;       
    
    public Gift(int GIFT_TYPE) {
            switch(GIFT_TYPE){
            case ESSENTIAL : type = ESSENTIAL;
                            break;
            case UTILITY : type = UTILITY;
                            break;
            case LUXURY : type = LUXURY;
                            break;
            default : type = -1;
        }
    }
    
    void makeGift(int GIFT_TYPE){
        switch(GIFT_TYPE){
            case ESSENTIAL : type = ESSENTIAL;
                            break;
            case UTILITY : type = UTILITY;
                            break;
            case LUXURY : type = LUXURY;
                            break;
            default : type = -1;
        }
    }
      
    
    String giftType(){
        return  types[type];
    }
    
    int getValue(){
        switch(type){
            case ESSENTIAL : return 50;
            case UTILITY : return 100; 
            case LUXURY : return 200*2;
            default : return 0;
        }
    }
}
