package com.web.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

        @GetMapping("/greeting")
    public String greetingForm(@ModelAttribute Person person, Model model) {
        //model.addAttribute("greeting", person);
        person.writeToFile();
        return "greeting";
    }
}
