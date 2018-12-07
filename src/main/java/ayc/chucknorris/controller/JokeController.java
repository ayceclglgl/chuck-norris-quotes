package ayc.chucknorris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ayc.chucknorris.service.JokeServiceImpl;
/*
 * Java based configuration
 */
@Controller
public class JokeController {
	private JokeServiceImpl jokeService;
	
	public JokeController(JokeServiceImpl jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/joke")
	public String getJoke(Model model) {
		model.addAttribute("joke", jokeService.getRandomJokeQuotes());
		return "chucknorris";
	}
}
