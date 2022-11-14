package com.example.proyectweb1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page1")
public class Controller1 {
    @GetMapping("/tex1")
public String getText1(){

    return "page 1 text1";
}


}
