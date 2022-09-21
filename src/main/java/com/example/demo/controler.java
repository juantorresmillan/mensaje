
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controler {
    @GetMapping("/")
        public String mensaje(){
            return "Modificando repositorio clase 20 de septiembre";
        }
}
