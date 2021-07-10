package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;


    @ManyToMany(mappedBy = "customers", targetEntity = Shop.class) // (fetch= FetchType.LAZY)  //(cascade = CascadeType.MERGE) - каскад на child это плохо!
    //@JoinColumn(name = "shop_id")
    private Set<Shop> shop;

    public Customer(String firstName, String lastName, Set<Shop> shop) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shop = shop;
    }

    public Customer() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Shop> getShop() {
        return shop;
    }

    public void setShop(Set<Shop> shop) {
        this.shop = shop;
    }
}
