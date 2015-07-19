package com.springinaction.springidol;

/**
 * Created by p12se on 19.07.15.
 */
public class Volunteer implements Thinker{

    private String thoughts;

    public void thinkOfSomething(String thoughts){
        this.thoughts = thoughts;
    }
    public String getThoughts(){
        return thoughts;
    }
}
