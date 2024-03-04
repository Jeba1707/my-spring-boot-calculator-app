package com.example.calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    //url = http://localhost:8090/hello/jeba
@GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "Hello "+name;
    }

    //url=http://localhost:8090/sum?num1=10&num2=20
    @GetMapping("/sum")
    public int add(@RequestParam("num1") int a,@RequestParam("num2") int b) {
        return a + b;
    }
    //url=http://localhost:8090/sub?num1=10&num2=20
    @GetMapping("/sub")
    public int sub(@RequestParam("num1") int a,@RequestParam("num2") int b) {
        return a - b;
    }

    //url=http://localhost:8090/mul?num1=10&num2=20
    @GetMapping("/mul")
    public int mul(@RequestParam("num1") int a,@RequestParam("num2") int b) {
        return a * b;
    }
    //url = http://localhost:8090/div?num1=100&num2=20
    @GetMapping("/div")
    public double div(@RequestParam("num1") int a,@RequestParam("num2") int b) {
        return (double)a / b;
    }


}
