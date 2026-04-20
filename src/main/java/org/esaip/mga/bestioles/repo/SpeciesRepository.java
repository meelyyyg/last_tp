package org.esaip.mga.bestioles.repo;

import org.esaip.mga.bestioles.bo.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SpeciesRepository extends JpaRepository<Species, Integer> {

    Species findFirstByCommonName(String commonName);
    List<Species> findByLatinNameContainingIgnoreCase(String partialLatinName);

}
