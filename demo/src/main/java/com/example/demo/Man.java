package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Man implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String LastName;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="wife_id") //- по умолчанию wife_id
    private Woman woman;

    public Man() {
    }

    public Man(String firstName, String lastName, Woman woman) {
        this.firstName = firstName;
        LastName = lastName;
        this.woman = woman;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Woman getWife() {
        return woman;
    }

    public void setWife(Woman woman) {
        this.woman = woman;
    }
}
