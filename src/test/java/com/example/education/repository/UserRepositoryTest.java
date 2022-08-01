package com.example.education.repository;

import com.example.education.entity.Address;
import com.example.education.entity.Person;
import com.example.education.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    @Test
    public void saveUser(){
        Address address =
                Address.builder()
                        . street("DTM")
                        .city("HCM").build();
        System.out.println("address = " + address);

        User user = User.builder()
                .name("Tien")
                .phone("09090909")
                .address(address)
                .build();
        System.out.println("user = " + user);

        userRepository.save(user);
    }



}