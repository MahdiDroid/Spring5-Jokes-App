package com.mahdidroid.jokeapp.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public abstract class Services implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public Services() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
