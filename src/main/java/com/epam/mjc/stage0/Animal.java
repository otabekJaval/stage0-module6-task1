package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;



    public Animal(String color, int numberOfPaws, boolean hasFue) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFue;
    }

    public String getDescription(){
        if(hasFur&&numberOfPaws>1)
       return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and a fur.";
        if(hasFur&&numberOfPaws==1)
        return "This animal is mostly "+color+". It has "+numberOfPaws+" paw and a fur.";
        return "This animal is mostly "+color+". It has "+numberOfPaws+" paws and no fur.";

    }
}



