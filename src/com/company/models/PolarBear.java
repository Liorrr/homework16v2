package com.company.models;

public class PolarBear extends Bear {


    public PolarBear(int age, Color furColor, int weight, boolean isHostile) {
        super(age, furColor, weight, isHostile);
    }

    @Override
    public void eat() {
        System.out.println("The Polar-bear is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Polar-bears doesn't sleep for long time, we got to go");
    }

    public static void mate(PolarBear x, PolarBear y){
        System.out.println(x + " and " +y+ "..... NSFW");
    }
	public void hunt(){
        System.out.println("Poor seal.. didn't had a chance");
    }


}
