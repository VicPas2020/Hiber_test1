package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String brand;

    private String address;


    @ManyToMany(targetEntity = Customer.class, cascade = CascadeType.PERSIST)
    @JoinTable(
            name="shop_customer",
            joinColumns=@JoinColumn(name="shop_ID", referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name="customer_ID", referencedColumnName="ID"))

    private Set<Customer> customers;

    public Shop() {

    }


    public Shop(String brand, String address, Set<Customer> customers) {
        this.brand = brand;
        this.address = address;
        this.customers = customers;
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

    public Set<Customer> getStudents() {
        return customers;
    }

    public void setStudents(Set<Customer> customers) {
        this.customers = customers;
    }
}
