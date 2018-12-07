package ayc.chucknorris.service;

import org.springframework.stereotype.Service;

import ayc.chucknorris.model.Joke;

@Service
public class JokeServiceImpl implements JokeService {
	private Joke joke;

	public JokeServiceImpl(Joke joke) {
		this.joke = joke;
	}

	@Override
	public String getRandomJokeQuotes() {
		return joke.getJoke();
	}

}
