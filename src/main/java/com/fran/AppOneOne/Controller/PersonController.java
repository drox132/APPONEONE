package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Person;
import com.fran.AppOneOne.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/selectallperson")
    public List<Person> selectAllPerson(){
        return personService.selectAllPerson();
    }

    @GetMapping("/selectpersonby/{id}")
    public Person selectPersonById(@PathVariable int id) {
        return personService.selectPersonById(id);
    }

    @PostMapping("/insertperson")
    public void insertPerson(@RequestBody Person nuevaPerson){
        personService.insertPerson(nuevaPerson);
    }

    @PostMapping("/updateperson")
    public void updatePersonById(@RequestBody Person updatePerson) {
        personService.updatePersonById(updatePerson);
    }

    @DeleteMapping("/deleteperso{id}")
    public void deletePersonById(@PathVariable int id) {
        personService.deletePersonById(id);
    }
}
