package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Woman {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String firstName;
    private String LastName;

    @OneToOne(mappedBy = "woman") // - mappedBy - если нужно чтобы в БАЗЕ этого поля НЕ было.
    //@JoinColumn(name ="fk_husband") - по умолчанию husband_id
    private Man man;






    public Woman() {
    }


    public Woman(String firstName, String lastName, Man man) {
        this.firstName = firstName;
        LastName = lastName;
        this.man = man;
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

    public Man getHusband() {
        return man;
    }

    public void setHusband(Man man) {
        this.man = man;
    }
}
