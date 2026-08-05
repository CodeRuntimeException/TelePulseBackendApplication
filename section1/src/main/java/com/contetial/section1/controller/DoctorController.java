package com.contetial.section1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController
{
    @GetMapping
    public ResponseEntity<String> readAllDoctors()
    {
        String message = "Here Is The List Of All Doctors";
        return ResponseEntity.ok(message);
    }
}
