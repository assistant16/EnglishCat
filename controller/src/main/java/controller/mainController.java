package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController()
@RequestMapping(value = "/app")
public class mainController    {

    @GetMapping("/h")
    public String printHello(){
        System.out.println("hello w");
        return "hello";
    }


}
