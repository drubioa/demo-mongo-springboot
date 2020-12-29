package es.drubioa.demo.repository;

import es.drubioa.demo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByNif(String nif);
}
