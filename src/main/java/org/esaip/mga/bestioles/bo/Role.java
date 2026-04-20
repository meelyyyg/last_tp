package org.esaip.mga.bestioles.bo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "role", schema = "bestioles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "label", nullable = false, length = 50)
    private String label;

    @ManyToMany
    @JoinTable(name = "person_role", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "person_id")})
    private Set<Person> people = new LinkedHashSet<>();


}