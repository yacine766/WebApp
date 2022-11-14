package com.example.proyectweb1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller2 {
    @RestController
    @RequestMapping("/page2")
    public class Controller1 {
        @GetMapping("/tex1")
        public String getText1(){

            return "page 2 text1";
        }

}}
