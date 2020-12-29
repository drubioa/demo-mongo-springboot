package es.drubioa.demo.service;

import es.drubioa.demo.dto.PersonDto;
import es.drubioa.demo.exception.PersonNotFoundException;
import es.drubioa.demo.mapper.PersonMapper;
import es.drubioa.demo.repository.PersonRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonMapper personMapper;

    public PersonDto findByNif(String nif) {
        val person = personRepository.findByNif(nif);
        if(person == null) {
            throw new PersonNotFoundException();
        }
        return personMapper.personToPersonDto(person);
    }

    public void create(PersonDto personDto) {
        val person = personMapper.personDtoToPerson(personDto);
        personRepository.insert(person);
    }
}
