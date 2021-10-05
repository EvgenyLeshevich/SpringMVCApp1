package com.evgeniy.spring.mvc.test.xml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world") // Когда пользователь будет набирать url "/hello-world" - его запрос
    // будет приходить в этот контроллер, в этот метод
    public String sayHello(){
        return "hello_world";
    }
}
