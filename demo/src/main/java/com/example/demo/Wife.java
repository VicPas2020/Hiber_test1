package com.example.demo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wife {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String firstName;
    private String LastName;

    @OneToOne(mappedBy = "wife") // - mappedBy - если нужно чтобы в БАЗЕ этого поля НЕ было.
    //@JoinColumn(name ="fk_husband") - по умолчанию husband_id

    private Husband husband;




}
