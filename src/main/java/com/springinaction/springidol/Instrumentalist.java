//<start id="instrumentalist_java" /> 
package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


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


  private Instrument instrument;

  @Autowired
  @Qualifier("piano")
  public void setInstrument(Instrument instrument) { //<co id="co_injectInstrument"/>
    this.instrument = instrument;
  }
}
//<end id="instrumentalist_java" />
