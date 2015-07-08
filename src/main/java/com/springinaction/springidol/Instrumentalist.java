//<start id="instrumentalist_java" /> 
package com.springinaction.springidol;

import com.springinaction.springidol.qulifiers.*;
import com.springinaction.springidol.qulifiers.Strummed;
import org.springframework.beans.factory.annotation.Autowired;


public class Instrumentalist implements Performer {
  public Instrumentalist() {
  }

  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    instrument.play();
  }

  private String song;

  public void setSong(String song) { //<co id="co_injectSong"/>
    this.song = song;
  }

  public String getSong() {
    return song;
  }

  public String screamSong() {
    return song;
  }

  @Autowired
  @StringedInstrument
  @Strummed
  private Instrument instrument;


  public void setInstrument(Instrument instrument) { //<co id="co_injectInstrument"/>
    this.instrument = instrument;
  }
}
//<end id="instrumentalist_java" />