package com.example.demo;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class Engine implements Serializable {


    long empid;

    int mark = 1;
    int power = 2000;


    public Engine(long empid, int mark, int power) {
        this.empid = empid;
        this.mark = mark;
        this.power = power;
    }

    public Engine() {
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
