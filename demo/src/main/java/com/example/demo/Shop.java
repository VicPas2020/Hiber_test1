package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String brand;

    private String address;

    //  NO ASSOCIATION


    public Shop() {

    }


    public Shop(String brand, String address, Set<Customer> customers) {
        this.brand = brand;
        this.address = address;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String name) {
        this.brand = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }





















//    @ManyToMany(/*mappedBy = "university",*/ targetEntity = Customer.class, cascade = CascadeType.PERSIST)
//    private Set<Customer> customers;
//
//    public Shop() {
//
//    }
//
//
//    public Shop(String brand, String address, Set<Customer> customers) {
//        this.brand = brand;
//        this.address = address;
//        this.customers = customers;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String name) {
//        this.brand = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Set<Customer> getStudents() {
//        return customers;
//    }
//
//    public void setStudents(Set<Customer> customers) {
//        this.customers = customers;
//    }
}
