package com.example.demo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Wife {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     ;


    private String firstName;
    private String LastName;




    @OneToOne(mappedBy = "wife") // - mappedBy - если нужно чтобы в БАЗЕ этого поля НЕ было.
    @JoinColumn(name ="husband_id") //- по умолчанию husband_id
    @MapsId
    private Husband husband;







    public Wife() {
    }

    public Wife(String firstName, String lastName, Husband husband) {
        this.firstName = firstName;
        LastName = lastName;
        this.husband = husband;
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

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
