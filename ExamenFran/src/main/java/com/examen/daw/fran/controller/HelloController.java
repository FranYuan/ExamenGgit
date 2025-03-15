package com.examen.daw.fran.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/api")
public class HelloController {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "¡Hola!";
    }

    @PostMapping("/build")
        public String sayBuild(){
            return "¡Creado!";
        }

    @PutMapping("/update/{id}")
        public String sayUpdate(@PathVariable("id") String id){
            return "¡Has actualizado: " + id + " !";
        }
}
