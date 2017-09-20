package fyi.jay.spring5demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fyi.jay.spring5demo.repository.AuthorRepository;

/**
 * Created by jyu on 9/19/17.
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors" , authorRepository.findAll());
        return "authors";
    }

}
