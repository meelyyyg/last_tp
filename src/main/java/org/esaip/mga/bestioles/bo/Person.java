package org.esaip.mga.bestioles.bo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "person", schema = "bestioles")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "age")
    private Integer age;

    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;

    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;

    @Column(name = "login", nullable = false, length = 50)
    private String login;

    @Column(name = "mdp", nullable = false, length = 100)
    private String mdp;

    @ColumnDefault("1")
    @Column(name = "active", nullable = false)
    private Byte active;

    @ManyToMany(mappedBy = "people")
    private Set<Animal> animals = new LinkedHashSet<>();


}