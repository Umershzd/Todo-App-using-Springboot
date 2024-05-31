package com.springbootApp.myFirstSpringBootApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
@RequestMapping("/call")
@ResponseBody
    public String hello()
    {
        System.out.println("Hello");
        return "Umer Shahzad";
    }

    @GetMapping("/hellohtml")
    public String hellohtml()
    {
        System.out.println("Hello");
        return "hellohtml";
    }
    @GetMapping("/hellojsp")
    public String hellohtml2()
    {
        System.out.println("Hello");
        return "hellojsp";
    }

}
