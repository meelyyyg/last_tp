package org.esaip.mga.bestioles.repo;

import org.esaip.mga.bestioles.bo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
