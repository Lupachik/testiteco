package com.iteco.temp.controller;

import com.iteco.temp.domain.Task;
import com.iteco.temp.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class TempController {
    @Autowired
    private TaskRepo taskRepo;

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
        Iterable<Task> tasks = taskRepo.findAll();
        model.addAttribute("tasks", tasks);
        return "main";
    }

    //обработка полей ввода
    //без дополнительного пути, тк форма будет отправляться на тот же адрес откуда пришла сама страничка
    @PostMapping
    public String add(@RequestParam String name,
                      @RequestParam String description,
                      Model model){
        // !!!! уточнить может быть все параметры вводить в конструктор, а может только те которые выводить в таблицу списка
        //создаем новую задачу
        Task task = new Task(name, description);
        // сохраняем задачу
        taskRepo.save(task);

        // возвращаем список сообщений который лежит в базе данных
        Iterable<Task> tasks = taskRepo.findAll();
        model.addAttribute("tasks", tasks);

        return "main";
    }

}
