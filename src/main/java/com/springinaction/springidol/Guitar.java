//<start id="piano_java" /> 
package com.springinaction.springidol;

import com.springinaction.springidol.qulifiers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Guitar implements Instrument {
  public Guitar() {
  }

  public void play() {
    System.out.println("TRINK TRINK TRIIINK");
  }
}
//<end id="piano_java" />
