package com.matera.bootcamp2026seq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/hello_world")
public class HelloWorld {

    public ResponseEntity<Map<String, String>> hello(){

    }
}
