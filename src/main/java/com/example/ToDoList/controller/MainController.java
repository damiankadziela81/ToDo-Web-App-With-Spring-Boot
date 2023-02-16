package com.example.ToDoList.controller;

import com.example.ToDoList.model.Task;
import com.example.ToDoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping("/")
    public String getTasks(Model model){

//        List<Task> tasks = new ArrayList<>();
//        tasks.add(new Task(1,2,"pay bills", LocalDate.of(2023,3,1)));
//        tasks.add(new Task(2,3,"call John", LocalDate.of(2023,2,21)));
//        tasks.add(new Task(3,1,"add new feature in my app", LocalDate.of(2023,2,15)));
//        tasks.add(new Task(4,2,"prepare for presentation", LocalDate.of(2023,3,5)));

        List<Task> tasks = taskRepository.findAll();

        model.addAttribute("tasks",tasks);

        return "index";
    }
}
