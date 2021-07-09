package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("Machine")
@PrimaryKeyJoinColumn(name = "name")
@NamedNativeQuery(name = "aa", query = "SELECT name FROM fafafa WHERE id = 7")
//@AccessType(value = AccessType.Type.FIELD)

public class Machine extends AbstractEntity{

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;



    //@Column(name = "ffdfdfd")
    private String engine;




    public Long getId() {
        return super.id;
    }
    //@AccessType(value = AccessType.Type.PROPERTY)


    public String getEngine() {
        return engine;
    }



    public void setId(Long id) {
        this.id = id;
    }


    public void setEngine(String name) {
        this.engine = name;
    }

    public Machine() {
    }

    public Machine( String engine) {

        this.engine = engine;
    }

    public Machine(Long id, String engine) {
        this.id = id;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + engine + '\'' +
                '}';
    }
}
