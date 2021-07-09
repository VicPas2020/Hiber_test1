package com.example.demo;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "abstract")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;

    @Column(name = "fammmile")
    protected String family = "abs_const";



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id=" + id +
                ", family='" + family + '\'' +
                '}';
    }
}
