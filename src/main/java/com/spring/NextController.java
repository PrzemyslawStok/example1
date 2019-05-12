package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NextController {
    @Autowired
    DataRepository dataRepository;

    @GetMapping("/showHtml")
    public String showHtml(Model model){

        model.addAttribute("attr0","1234556");
        return "showHtml";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam Double a, @RequestParam Double b, Model model){
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("suma",a+b);

        return "addNumbers";
    }

    @GetMapping("/printDatabaseHtml")
    public String printDatabase(Model model){
        Iterable<Data> data = dataRepository.findAll();
        Data point = data.iterator().next();

        model.addAttribute("x",point.getX());
        model.addAttribute("y",point.getY());

        model.addAttribute("dataTable",data);

        return "printDatabaseHtml";
    }
}
