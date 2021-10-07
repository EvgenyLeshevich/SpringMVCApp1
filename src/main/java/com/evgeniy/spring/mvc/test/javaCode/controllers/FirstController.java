package com.evgeniy.spring.mvc.test.javaCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    // Если нам нужно достать только параметры из поступающего get-запроса, то лучше использовать
    // аннотацию @RequestParam
    // В случае если мы не передали параметры, то вызовется ошибка
    // Если используем данную аннотацию, то нам нужно передавать параметры, или поставить
    // внутрь аннотации required = false
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "firstname",required = false) String firstname,
                            @RequestParam(value = "lastname",required = false) String lastname,
                            Model model){
        // Получаем информацию от пользователя, то есть get-запрос, помещаем это в модель и
        // можем отобразить это пользователю на страницу(в представление)
        model.addAttribute("message", "Hello " + firstname + " " + lastname);
        //System.out.println("Hello " + firstname + " " + lastname);

        return "first/hello"; // first - означает, что все представления которые относятся к данному контроллеру
        // будут лежать в папке first
    }
    // Если нам нужна полная информация по запросе, то используем HttpServletRequest
//    @GetMapping("/hello")
    // В случае если мы не передали параметры HttpServletRequest кладёт в них значения null
//    public String helloPage(HttpServletRequest request){ // HttpServletRequest request - в этом объекте
//        // содержаться все сведения о поступающем запросе
//        String firstname = request.getParameter("firstname");
//        String lastname = request.getParameter("lastname");
//
//        System.out.println("Hello " + firstname + " " + lastname);
//
//        return "first/hello"; // first - означает, что все представления которые относятся к данному контроллеру
//        // будут лежать в папке first
//    }

    @GetMapping("/goodbye")
    public String goodbyePage(){
        return "first/goodbye";
    }
}
