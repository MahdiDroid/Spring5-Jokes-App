package com.mahdidroid.jokeapp.Config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
