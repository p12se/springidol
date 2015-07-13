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
        return new Juggler();
    }

}
