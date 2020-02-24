package com.mahdidroid.jokeapp.Controller;


import com.mahdidroid.jokeapp.Services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokeController {

    private JokeService jokeService;

    @Autowired
    public jokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/"})
    public String showJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }
}
