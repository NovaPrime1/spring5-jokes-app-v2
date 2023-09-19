package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import services.JokeService;
import org.springframework.ui.Model;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "/index";

    }


}
