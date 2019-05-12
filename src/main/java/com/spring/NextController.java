package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NextController {
    @GetMapping("/showHtml")
    public String showHtml(Model model){

        model.addAttribute("attr0","1234556");
        return "showHtml";
    }
}
