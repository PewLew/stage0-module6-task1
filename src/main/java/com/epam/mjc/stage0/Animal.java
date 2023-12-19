package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int number_Of_Paws;
    private boolean has_Fur;
    public Animal(){

    }

    public Animal(String color, int number_Of_Paws, boolean has_Fur){
        this.color = color;
        this.number_Of_Paws = number_Of_Paws;
        this.has_Fur = has_Fur;
    }

    public String getDescription(){
        String myString;
        myString = "This animal is mostly " + color;
        if(number_Of_Paws >1){
            myString += ". It has " + number_Of_Paws + "paws ";
        }
        else
            myString += ". It has " + number_Of_Paws + "paw ";

        if(has_Fur){
            myString += "and a fur.";
        }
        else
            myString += "and no fur.";

        return myString;
    }
}
