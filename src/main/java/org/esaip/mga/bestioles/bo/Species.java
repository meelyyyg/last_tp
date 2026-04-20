package org.esaip.mga.bestioles.bo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "species", schema = "bestioles")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "common_name", nullable = false, length = 50)
    private String commonName;

    @Column(name = "latin_name", nullable = false, length = 200)
    private String latinName;

    @OneToMany
    @JoinColumn(name = "species_id")
    private Set<Animal> animals = new LinkedHashSet<>();


}