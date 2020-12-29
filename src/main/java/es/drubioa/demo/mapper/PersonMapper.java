package es.drubioa.demo.mapper;

import es.drubioa.demo.dto.PersonDto;
import es.drubioa.demo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonDto personToPersonDto(Person p) {
        return PersonDto.builder().name(p.getName()).surname(p.getSurnames()).age(p.getAge()).nif(p.getNif()).build();
    }

    public Person personDtoToPerson(PersonDto p) {
        Person person = new Person();
        person.setName(p.getName());
        person.setSurnames(p.getSurname());
        person.setAge(p.getAge());
        person.setNif(p.getNif());
        return person;
    }
}
