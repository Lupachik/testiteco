package com.iteco.temp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TempController {
    @GetMapping("/temp")
    public String temp(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "temp";
    }

    // вместо Model model, можно указать Map<String, Object> model
    // соответственно вместо model.addAttribute будет model.put

    // не указывая в скобках ссылку подразумеваем корневую страницу
    @GetMapping
    public String main(Model model){
        model.addAttribute("some", "hello, let's Code");
        return "main";
    }
}
