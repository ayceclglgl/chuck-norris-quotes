package ayc.chucknorris.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class Config {

	@Bean
	public ChuckNorrisQuotes quo() {
		return new ChuckNorrisQuotes() ;
		
	}
}
