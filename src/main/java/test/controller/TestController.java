package test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService service;
    private List<Integer> list = List.of(1, 2, 7, 5, 9, 3, 6);

    @GetMapping("/averageTest")
    public Double average() {
        double average = service.average(list);
        System.out.println("Average: "+average);
        return average;
    }
}
