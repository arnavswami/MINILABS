package com.arnav.minilabs;






import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

    @RequestMapping("")
    @Controller
    public class MainController
    {
        @GetMapping("/")
        public String Index(){
            return "index";
        }



}
