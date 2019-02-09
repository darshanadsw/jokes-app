package guru.springframwork.jokes.app.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Darshana Welikala on 2019-02-09.
 */
@Service
public class JokesServiceImpl implements JokesService {

    @Override
    public String getRandomQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
