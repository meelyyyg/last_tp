package org.esaip.mga.bestioles.repo;

import org.esaip.mga.bestioles.bo.Animal;
import org.esaip.mga.bestioles.bo.Species;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    List<Animal> findBySpecies(Species species);

    List<Animal> findByColorIn(List<String> colors);
}
