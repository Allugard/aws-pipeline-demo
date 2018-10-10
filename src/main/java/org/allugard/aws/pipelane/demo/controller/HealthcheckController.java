package org.allugard.aws.pipelane.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {


    @GetMapping("/")
    public String ping() {
        return "Alive";
    }

}
