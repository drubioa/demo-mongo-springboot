package es.drubioa.demo.controller;

import es.drubioa.demo.dto.PersonDto;
import es.drubioa.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping()
    @RequestMapping("/{nif}")
    @ResponseStatus(HttpStatus.OK)
    public PersonDto findByNif(@PathVariable("nif") String nif) {
        return personService.findByNif(nif);
    }

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody PersonDto personDto) {
        personService.create(personDto);
    }
}
