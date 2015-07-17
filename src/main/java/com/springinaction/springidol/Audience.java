package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by p12se on 17.07.15.
 */
public class Audience {
    public void takeSeats(){
        System.out.println("the audience is taking their seats.");
    }

    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphones");
    }
    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAPUS");
    }
    public void demandRefund(){
        System.out.println("Boo WE want our money back!");
    }

    public void ura(){
        System.out.println("URĀÆ URĀÆ URĀÆ URĀÆ URĀÆ URĀÆ URĀÆ URĀÆ URĀÆ URĀÆ");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();

            joinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start) + " milliseconds");

        }catch (Throwable t){
            System.out.println("BOOO We want our money back!!!!!");
        }
    }
}
