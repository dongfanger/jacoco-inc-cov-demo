package com.example.jacocoinccovdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WorldController {
    @RequestMapping(value = "world", method = RequestMethod.GET)
    public String world() {
        return "world";
    }
}
