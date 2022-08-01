package com.example.education.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String street;
    private String city;

    @OneToOne(mappedBy = "address")
    private User user;

//    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
//    //@EqualsAndHashCode.Exclude
//    //@ToString.Exclude
//    private Collection<Person> persons;
}
