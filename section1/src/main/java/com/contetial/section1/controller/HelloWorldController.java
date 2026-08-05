package com.contetial.section1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.spi.ResourceBundleProvider;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController
{
    @GetMapping
    public ResponseEntity<String> hello()
    {
        return ResponseEntity.ok("Hello People");
    }

    // http://localhost:8080/api/hello/v2
    @GetMapping("/v2")
    public ResponseEntity<String> helloV2()
    {
        return ResponseEntity.ok("Hello People Of S2P");
    }
}
