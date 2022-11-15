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
    @GetMapping("/tex2")
    public String getText2(){

        return "page 3 text2";
    }
    @GetMapping("/tex3")
    public String getText3(){

        return "page 3 text3";
    }
    //update on on branch 1
    // after PR comment

    }

