package com.evgeniy.spring.mvc.test.javaCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/hello") // Означает, что мы хотим что бы все методы в данном контроллере имели префикс
// "/hello", то есть метод sayHello будут вызываться по адресу "/hello/world"
public class HelloControllerWithJavaCode {
    // @GetMapping - означает, что мы хотим обрабатывать в методе get запросы от пользователя по адресу
    // указываему в скобках
    @GetMapping("/world") // Когда пользователь будет набирать url "/hello-world" - его запрос
      // будет приходить в этот контроллер, в этот метод. И в самом методе мы возвращаем страничку под названием hello_world
    // За расположение этой странички отвечает SpringConfig где прописаны Prefix("/WEB-INF/views/") и
    // Suffix(".html")
    public String sayHello(){
        return "hello_world";
    }
}
