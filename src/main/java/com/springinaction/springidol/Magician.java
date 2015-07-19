package com.springinaction.springidol;

/**
 * Created by p12se on 19.07.15.
 */
public class Magician implements MindReader {
    private String thoughts;

    public void interceptThoughts(String thoughts){
        System.out.println("Intercepting volunteers, " + thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}
