package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws = 0;
    private boolean hasFur;
    public Animal(){

    }

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String myString;
        myString = "This animal is mostly " + color;
        if(numberOfPaws >1){
            myString += ". It has " + numberOfPaws + " paws ";
        }
        else
            myString += ". It has " + numberOfPaws + " paw ";

        if(hasFur){
            myString += "and a fur.";
        }
        else
            myString += "and no fur.";

        return myString;
    }
}
