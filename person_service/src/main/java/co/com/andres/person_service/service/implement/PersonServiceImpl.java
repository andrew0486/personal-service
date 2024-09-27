package co.com.andres.person_service.service.implement;

import co.com.andres.person_service.model.entity.Person;
import co.com.andres.person_service.model.repository.PersonRepository;
import co.com.andres.person_service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Page<Person> getAllPersons(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    public Optional<Person> getPersonById(int id) {
        return personRepository.findById(id);
    }

    public Person createPerson(Person person) {
        person.setFechaInscripcion(LocalDate.now());
        return personRepository.save(person);
    }

    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }
}

