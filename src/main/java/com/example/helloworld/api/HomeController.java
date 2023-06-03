package com.example.helloworld.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> helloUserGet(String user) {
        return new ResponseEntity<>("hello " + user, HttpStatus.OK);
    }

    @GetMapping("/text")
    public String getPlainText() {
        return "This is a plain text response";
    }
}
