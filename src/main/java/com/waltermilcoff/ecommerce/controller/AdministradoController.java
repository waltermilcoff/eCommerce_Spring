package com.waltermilcoff.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/administrador")
public class AdministradoController {

    @GetMapping("")
    public String home(){
        return "administrador/home";
    }
}
