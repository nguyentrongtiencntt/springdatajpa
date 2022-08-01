package com.example.education.repository;

import com.example.education.entity.Address;
import com.example.education.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    AddressRepository addressRepository;


    @Test
    public void savePerson(){
        Address address =
                Address.builder()
                        .street("DTM")
                        .city("HCM").build();

        Person person = Person.builder()
                .name("Tien")
                .address(address)
                .build();



        System.out.println("person = " + person);
        System.out.println("address = " + address);
        addressRepository.saveAndFlush(address);

    }

}