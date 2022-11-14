package com.example.proyectweb1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller3 {

    @RequestMapping("/page3")

        @GetMapping("/tex1")
        public String getText1(){

            return "page 3 text1";
        }

    }

