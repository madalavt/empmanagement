package com.empapp.employeemanagementbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeemanagementbackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagementbackendApplication.class, args);
    }
    @GetMapping(value = "/")
    public String hello() {
        return "Hello World";
    }

}
