//package com.example.demo;
//
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.ManyToOne;
//import javax.persistence.MapsId;
//
//@Entity
//public class Dependent {
//
//    @EmbeddedId
//    Engine id;
//
//
//    @MapsId("empid")  //  maps the empid attribute of embedded id
//    @ManyToOne
//    Car emp;
//
//    public Dependent(Car emp) {
//        this.emp = emp;
//    }
//
//    public Dependent() {
//    }
//
//    public Car getEmp() {
//        return emp;
//    }
//
//    public void setEmp(Car emp) {
//        this.emp = emp;
//    }
//}
