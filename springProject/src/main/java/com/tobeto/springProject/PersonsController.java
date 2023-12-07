package com.tobeto.springProject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/persons") // Controllerın kontrol edeceği alt routerları tanımlar
public class PersonsController {
    List<Person> inMemoryList = new ArrayList<>();
    @GetMapping
    public List<Person> get(){ //api/persons
        return inMemoryList;
    }
    //@GetMapping("getById") //api/persons/get2 süslü parantez dinamik olarak değişeceğini ifade eder
    //query string, path variable = kullanıcan veri alma işlemleri
    //path https://localhost:8080/api/persons/1 => 1 = id
    //query string yine url den gönderiyoruz fakat "?" işareti ekliyoruz https://localhost:8080/api/persons?id=1
    @GetMapping("{id}")
    public Person getById(@PathVariable int id){ //query de @RequestParam
        //Lambda Expressions
        //Stream API
        Person person = inMemoryList.stream().filter((person1)->person1.getId() == id).findFirst().orElseThrow();
        return person;
    } //@Pathvariable eklemen lazım id nin pathden geleceğini söyler.
    @PostMapping
    public void add(@RequestBody Person person){
            inMemoryList.add(person);
    }
    @PutMapping
    public void update(@RequestBody Person person){

    }
    @DeleteMapping ("{id}")
    public void delete(@PathVariable int id){

    }
}
