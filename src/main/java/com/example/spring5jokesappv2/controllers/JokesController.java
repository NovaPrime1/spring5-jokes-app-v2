package com.example.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.spring5jokesappv2.services.JokeService;
import org.springframework.ui.Model;

@Controller
public class JokesController {

    private final JokeService jokeService;

//    @Autowired -- you can omit the sterotype as of Spring 5 if only one controller present.
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJokes(Model model){

        model.addAttribute("joke", jokeService.getJoke());

        return "index";

    }


}
