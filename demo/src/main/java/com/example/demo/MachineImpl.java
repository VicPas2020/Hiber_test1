package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("MachineImpl")
@PrimaryKeyJoinColumn(name = "MachineId")
public class MachineImpl extends Machine {

    private int number;
    private String volume;


    public MachineImpl() {
    }

    public MachineImpl(Long id, String engine, int number, String volume) {
        super(id, engine);
        this.number = number;
        this.volume = volume;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "MachineImpl{" +
                "id=" + id +
                ", family='" + family + '\'' +
                ", number=" + number +
                ", volume='" + volume + '\'' +
                "} " + super.toString();
    }
}
