package com.example.demo;

import javax.persistence.Entity;

@Entity


public class Machine_II extends AbstractEntity{

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;


    private String fire;





    public Long getId() {
        return super.id;
    }

    public String getFire() {
        return fire;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setFire(String name) {
        this.fire = name;
    }

    public Machine_II() {
    }

    public Machine_II(String engine) {

        this.fire = engine;

    }

    public Machine_II(Long id, String engine) {
        this.id = id;
        this.fire = engine;
    }


    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + fire + '\'' +
                '}';
    }
}
