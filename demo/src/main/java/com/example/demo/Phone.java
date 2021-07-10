package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Phone {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int number;




    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Person.class)
    //(cascade = CascadeType.PERSIST ) // CascadeType.ALL is good too
    @JoinColumn(name ="fk_person")  //если нужно переименовать колонку c маппингом.
    private Person person;


    public Phone() {
    }

    public Phone(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public Phone(int number, Person person) {
        this.number = number;
        this.person = person;
    }





}
