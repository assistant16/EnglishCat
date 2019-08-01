package englishCat.service.impl;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl {
    public String printHello(){
        System.out.println("hello world!");
        String string = "wow";
        return string;
    }
}
