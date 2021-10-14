package by.rouba.sfgjokeapp.controllers;

import by.rouba.sfgjokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);

        return "index";
    }
}
