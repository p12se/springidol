package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by p12se on 19.07.15.
 */

@Aspect
public class Magician implements MindReader {
    private String thoughts;

    @Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){

    }

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts){
        System.out.println("Intercepting volunteers, " + thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}
