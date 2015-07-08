//<start id="juggler_java" /> 
package com.springinaction.springidol;

public class Juggler implements Performer {
  private double beanBags = 4;

  public Juggler() {
  }

  public Juggler(double beanBags) {
    this.beanBags = beanBags;
  }

  public void perform() throws PerformanceException {
    System.out.println("JUGGLING " + beanBags + " BEANBAGS");
  }
}
//<end id="juggler_java" />
