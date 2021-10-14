package by.rouba.sfgjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ChuckNorrisJokeService implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
