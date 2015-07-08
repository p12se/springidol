//<start id="piano_java" /> 
package com.springinaction.springidol;

import com.springinaction.springidol.qulifiers.*;

@StringedInstrument
@Strummed
public class HammerDulciner implements Instrument {
  public HammerDulciner() {
  }

  public void play() {
    System.out.println("TRA TA TA TAAA");
  }
}
//<end id="piano_java" />
