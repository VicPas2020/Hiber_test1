package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity(name = "hahaha")

@NamedNativeQuery(name = "aa", query = "SELECT name FROM fafafa WHERE id = 7")
//@AccessType(value = AccessType.Type.FIELD)

public class Machine extends AbstractEntity{

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;



    //@Column(name = "ffdfdfd")
    private String name;




    public Long getId() {
        return super.id;
    }
    //@AccessType(value = AccessType.Type.PROPERTY)


    public String getName() {
        return name;
    }



    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Machine() {
    }

    public Machine( String name) {

        this.name = name;
    }

    public Machine(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
