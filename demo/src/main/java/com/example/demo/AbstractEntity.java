package com.example.demo;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;


@Table(name = "abstract")
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;

    @Column(name = "fammmile")
    protected String family = "abs_const";

    public AbstractEntity(String family) {
        this.family = family;
    }

    public AbstractEntity() {
    }

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
