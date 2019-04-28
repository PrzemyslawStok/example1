package com.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @RequestMapping("/printText")
    public String zwrocNapis(){
        return "Przykładowy napis";
    }
}
