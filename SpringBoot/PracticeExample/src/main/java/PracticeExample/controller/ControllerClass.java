package PracticeExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @RequestMapping("/")
    public String getResponse(){

        return "Hello There! ";
    }


}
