package org.esaip.mga.bestioles.repo;

import org.esaip.mga.bestioles.bo.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species, Integer> {
}
