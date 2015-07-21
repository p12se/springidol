package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by p12se on 13.07.15.
 */
@Configuration
public class SpringConfig {

    @Bean
    public Performer serg(){
        return new Juggler("Serg");
    }
    @Bean
    public Guitar guitar(){
        return new Guitar();
    }

    @Bean
    public Piano piano(){
        return new Piano();
    }

    @Bean
    public Poem sonnet29(){
        return new Sonnet29();
    }

//    @Bean
//    public Performer poeticDuke(){
//        return new PoeticJuggler(sonnet29());
//    }

    @Bean
    public Performer kenny(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("DISSKO-DISSKO");
        return kenny;
    }

    @Bean
    public Audience audience(){
        return new Audience();
    }
//
    @Bean
    public Magician magician() {return new Magician();}

    @Bean Volunteer volunteer(){
        return new Volunteer();
    }

}
