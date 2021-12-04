package com.company.models;

public class GrizzlyBear extends Bear {

    public GrizzlyBear(int age, Color furColor, int weight, boolean isHostile) {
        super(age, furColor, weight, isHostile);
    }

    @Override
    public void eat() {
        System.out.println("So majestic");
    }

    @Override
    public void sleep() {
        System.out.println("See you in the summer");
    }

    public static void mate(GrizzlyBear x, GrizzlyBear y ){
        System.out.println(x + " and " +y+ "..... NSFW");
    }
    public void hunt(){
        System.out.println("When Grizzly on the hunt no one is safe, GTFOOH!");
    }

}
