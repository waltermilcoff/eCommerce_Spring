package com.waltermilcoff.ecommerce.controller;

import com.waltermilcoff.ecommerce.model.Producto;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(ProductoController.class);


    @GetMapping("")
    public String show(){
        return "productos/show";
    }


    @GetMapping("/create")
    public String create(){
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto){
        LOGGER.info("Este es el objeto producto {}", producto);
        return "redirect:/productos";
    }
}
