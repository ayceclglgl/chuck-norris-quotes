package ayc.chucknorris.model;

import org.springframework.stereotype.Component;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Component
public class Joke {
	private final ChuckNorrisQuotes quo;
	
	public Joke(ChuckNorrisQuotes quo) {
		this.quo=quo;
	}
	
	public String getJoke() {
		return quo.getRandomQuote();
	}
	

}
