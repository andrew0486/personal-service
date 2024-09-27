package co.com.andres.person_service.model.repository;

import co.com.andres.person_service.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}

