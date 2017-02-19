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
            case ESSENTIAL : return 100; // 100 RS
            case UTILITY : return 200; // 200 RS
            case LUXURY : return 300*2; // 600 RS
            default : return 0; // 0 RS
        }
    }
}
