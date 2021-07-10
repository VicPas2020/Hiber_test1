package com.example.demo;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Car   {


//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    private String brand;
    private int price;

    @EmbeddedId
    private Engine engine;


    public Car() {
    }


    public Car(String brand, int price, Engine engine) {
        this.brand = brand;
        this.price = price;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
