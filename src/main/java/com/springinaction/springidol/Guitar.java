//<start id="piano_java" /> 
package com.springinaction.springidol;

import com.springinaction.springidol.qulifiers.*;

@StringedInstrument
public class Guitar implements Instrument {
  public Guitar() {
  }

  public void play() {
    System.out.println("TRINK TRINK TRIIINK");
  }
}
//<end id="piano_java" />
