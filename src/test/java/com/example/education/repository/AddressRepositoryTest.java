package com.example.education.repository;

import com.example.education.entity.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddressRepositoryTest {

    @Autowired
    AddressRepository addressRepository;

    @Test
    public void saveAddress(){
        Address address = Address.builder()
                .city("QN")
                .street("NCT")
                .build();
        System.out.println("address = " + address);
        addressRepository.save(address);
    }


}