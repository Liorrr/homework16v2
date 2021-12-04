package com.company.models;

public class PandaBear extends Bear {

    public PandaBear(int age, Color furColor, int weight, boolean isHostile) {
        super(age, furColor, weight, isHostile);
    }



    @Override
    public void eat() {
        System.out.println("So stupid");
    }

    @Override
    public void sleep() {
        System.out.println("So stupid");
    }

    public static void mate (PandaBear x ,PandaBear y){
        System.out.println("Come-onnnn do the thing all ready you stupid bear");
    }
}
