package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class Controller {
    int i = 0;
    @GetMapping
    public String getStudents() throws InterruptedException {
        Thread.sleep(1000);
        i++;
        return "firstStudent"+i;
    }
}
