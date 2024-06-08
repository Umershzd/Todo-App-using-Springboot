package com.springbootApp.myFirstSpringBootApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
//    private  AuthenticateService authenticateService;
//
//    public loginController(AuthenticateService authenticateService) {
//        this.authenticateService = authenticateService;
//    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model)
    {
        System.out.println("Hello login page Get method");
        model.put("name", "MUS");
        return "welcome";
    }
//    @RequestMapping(value="login",method = RequestMethod.POST)
//    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model)
//    {
//        if (authenticateService.authenticate(name,password)) {
//            model.put("name", name);
//
//            System.out.println("Hello login page POST");
//            return "welcome";
//        }
//        model.put("errormessage","Invalid Credentials , please try again...!");
//        return "login";
//    }


}
