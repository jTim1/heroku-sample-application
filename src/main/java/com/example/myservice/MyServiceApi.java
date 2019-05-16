package com.example.myservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceApi {
  @GetMapping("/")
  public String getValue() {
    return "Hello from my Service";
  }
}
