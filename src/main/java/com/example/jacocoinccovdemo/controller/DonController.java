package com.example.jacocoinccovdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DonController {
    @RequestMapping(value = "don", method = RequestMethod.GET)
    public String don() {
        return "dongfanger";
    }
}
