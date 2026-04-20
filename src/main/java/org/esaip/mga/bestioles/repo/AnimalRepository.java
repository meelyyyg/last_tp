package org.esaip.mga.bestioles.repo;

import org.esaip.mga.bestioles.bo.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
