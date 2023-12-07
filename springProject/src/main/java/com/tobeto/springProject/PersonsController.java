package com.tobeto.springProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/persons") // Controllerın kontrol edeceği alt routerları tanımlar
public class PersonsController {
    @GetMapping
    public String get(){ //api/persons
        return "Get 1";
    }
    @GetMapping("get2") //api/persons/get2
    public String get2(){
        return "Get 2";
    }
    @PostMapping
    public String post(){
        return "Tobeto";
    }
}
