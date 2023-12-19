package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird(){
        super("color", 2, false);
    }

    @Override
    public String getDescription(){
        String myString = super.getDescription();
        myString += " Moreover, it has 2 wings and can fly.";
        return myString;
    }
}
