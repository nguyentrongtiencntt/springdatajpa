package com.example.education.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="id")
    private Long id;
    private String name;

    // Many to One There are many persons in address
    @ManyToOne
    @JoinColumn(name = "address_id")
    //@EqualsAndHashCode.Exclude
    //@ToString.Exclude
    private Address address;
}
