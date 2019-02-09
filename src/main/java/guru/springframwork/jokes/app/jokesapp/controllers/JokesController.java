package guru.springframwork.jokes.app.jokesapp.controllers;

import guru.springframwork.jokes.app.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Darshana Welikala on 2019-02-09.
 */
@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getRandomJoke(Model model){
        model.addAttribute("joke",jokesService.getRandomQuote());
        return "chucknorris";
    }

}
