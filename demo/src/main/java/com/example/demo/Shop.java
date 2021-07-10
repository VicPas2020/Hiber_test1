package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String brand;

    private String address;


    @ManyToMany(targetEntity = Customer.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    @JoinTable(
//            name="shop_customer",
//            joinColumns=@JoinColumn(name="shop_ID", referencedColumnName="ID"),
//            inverseJoinColumns=@JoinColumn(name="customer_ID", referencedColumnName="ID"))
        @JoinColumn(name = "shop")
    private Set<Customer> customers;

    public Shop() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "brand='" + brand + '\'' +
                ", address='" + address + '\'' +

                '}';
    }
}
