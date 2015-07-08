//<start id="onemanband_java" /> 
package com.springinaction.springidol;

import java.util.List;
import java.util.Properties;

public class OneManBand implements Performer {
  public OneManBand() {
  }

  public void perform() throws PerformanceException {
//    for (Instrument instrument : instruments.keySet()); {
//      instrument.play();
//    }
  }

  private Properties instruments;

  public void setInstruments(Properties instruments) {
    this.instruments = instruments; //<co id="co_injectInstrumentCollection"/>
  }
}
//<end id="onemanband_java" />
