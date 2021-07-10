package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Customer findCustomerByFirstName(String firstName);
}
