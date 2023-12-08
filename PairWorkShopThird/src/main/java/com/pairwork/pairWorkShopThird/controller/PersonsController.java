package com.pairwork.pairWorkShopThird.controller;

import com.pairwork.pairWorkShopThird.modules.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/persons")
public class PersonsController {
    List<Person> inPersonList = new ArrayList<>();

    @GetMapping
    public List<Person> getInPersonList() {

        return inPersonList;
    }

    @GetMapping("{id}")
    public Person getById(@PathVariable int id) {

        Person person = inPersonList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst()
                .orElseThrow();
        return person;
    }

    @PostMapping
    public String setInPersonList(@RequestBody Person person) {
        inPersonList.add(person);
        return "Kullanıcı eklendi: " +
                "ID: " + person.getId() +
                ", İsim: " + person.getName() +
                ", Soyisim: " + person.getSurname() +
                ", Yaş: " + person.getAge();
    }

    @PutMapping("{id}")
    public String update(@PathVariable int id, @RequestBody Person person) {
        Person persons = inPersonList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst()
                .orElseThrow();
        persons.setName(person.getName());
        persons.setSurname(person.getSurname());
        persons.setAge(person.getAge());
        return "Kullanıcı güncellendi: " +
                "ID: " + id +
                ", İsim: " + persons.getName() +
                ", Soyisim: " + persons.getSurname() +
                ", Yaş: " + persons.getAge();
        /*for (Person persons : inPersonList) {
            if (persons.getId() == id) {
                persons.setName(person.getName());
                persons.setSurname(person.getSurname());
                persons.setAge(person.getAge());
                return "Kullanıcı güncellendi: " +
                        "ID: " + id +
                        ", İsim: " + persons.getName() +
                        ", Soyisim: " + persons.getSurname() +
                        ", Yaş: " + persons.getAge();

            } else {
                return "Kullanıcı bulunamadı";
            }
        }
        return null;*/
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id) {
        Person persons = inPersonList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst()
                .orElseThrow();
        inPersonList.remove(persons);
        return persons.getName() + " Silindi";
    }
        /*for (Person persons : inPersonList) {
            if (persons.getId() == id) {
                inPersonList.remove(persons);
                return persons.getName() + " Silindi";
            } else {
                return "Kullanıcı bulunamadı";
            }
        }
        return null;
    }*/
}
