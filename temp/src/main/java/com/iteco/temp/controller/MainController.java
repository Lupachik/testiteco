package com.iteco.temp.controller;

import com.iteco.temp.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private TaskRepo taskRepo;

    // ("/temp") меняем на корень("/")
    @GetMapping("/")
    public String temp(Model model) {
        return "temp";
    }

    // вместо Model model, можно указать Map<String, Object> model
    // соответственно вместо model.addAttribute будет model.put

    // не указывая в скобках ссылку подразумеваем корневую страницу
    // 4 этап выводим ее в отдельную страницу
    @GetMapping("/main")
    public String main(Model model){
        return "main";
    }
}
