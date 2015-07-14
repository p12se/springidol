//<start id="juggler_java" /> 
package com.springinaction.springidol;

public class Juggler implements Performer {
  private double beanBags = 4;
  private String name;

  public Juggler() {
  }

  public Juggler(String name){
    this.name = name;
  }
  public Juggler(double beanBags) {
    this.beanBags = beanBags;
  }

  public void perform() throws PerformanceException {
    System.out.println("JUGGLING " + beanBags + " BEANBAGS " + name);
  }
}
//<end id="juggler_java" />
