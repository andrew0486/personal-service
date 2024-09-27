package co.com.andres.person_service.service;

import co.com.andres.person_service.model.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public interface PersonService {

    public Page<Person> getAllPersons(Pageable pageable);

    public Optional<Person> getPersonById(int id);

    public Person createPerson(Person person);

    public void deletePerson(int id);
}
