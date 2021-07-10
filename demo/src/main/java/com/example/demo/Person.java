package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String LastName;




    @OneToMany(mappedBy = "person")// если не указать  - будет создана доп.таблица с общим маппиногом
//    @JoinTable //- это работает и по умолчанию, но можно прописать названия в ручную и установить ограничеия
//            (
//                    name="PERSON_PHONE_WHATEVER",
//                    joinColumns={ @JoinColumn(name="PERSON_ID_WHATEVER", referencedColumnName="ID") },
//                    inverseJoinColumns={ @JoinColumn(name="PHONE_ID_WHATEVER", referencedColumnName="ID", unique=true) }
//            )
    private List<Phone> phones /*= new ArrayList<>()*/;









    public Person() {
    }

    public Person(String firstName, String lastName, List<Phone> phones) {
        this.firstName = firstName;
        LastName = lastName;
        this.phones = phones;
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

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
