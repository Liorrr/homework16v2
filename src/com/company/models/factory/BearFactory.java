package com.company.models.factory;

import com.company.models.*;

import java.util.Random;

public class BearFactory {
    //-----------------------------------------------------------
    //  SET AS SINGLETON
    //-----------------------------------------------------------
    //create instance on JVM run time
    static BearFactory bearFactory = new BearFactory();
    //set constructor to be private
    private BearFactory() {

    }
    //method to return BearFactory instance
    public static BearFactory getInstance(){
        return bearFactory;
    }
    //-----------------------------------------------------------
    //  BEAR FACTORY SWITCH CASE
    //-----------------------------------------------------------
    Random random = new Random();

    public Bear generateBear (String bearName){
        switch (bearName){
            case "grizzlybear":
                System.out.println("creating a grizzly bear");
                return new GrizzlyBear(random.nextInt(25), Color.BROWN,random.nextInt(),true);
            case "polarbear":
                System.out.println("creating a polar bear");
                return new PolarBear(random.nextInt(30),Color.WHITE, random.nextInt(), true);
            case "pandabear":
                System.out.println("if you insist...");
                return new PandaBear(random.nextInt(20),Color.BLACK_AND_WHITE, random.nextInt(),false);
            default:
                System.out.println("please use one of the following: grizzlybear, polarbear, pandabear");
                return null;
        }
    }

}
