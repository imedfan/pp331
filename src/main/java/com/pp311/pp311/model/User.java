package com.pp311.pp311.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "car")
    private String car;

    @Column(name = "family")
    private boolean family;

    public User() {
    }

    public User(String name, int age, String car, boolean family) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.family = family;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCar() {
        return this.car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public boolean isFamily() {
        return this.family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", car='" + car + '\'' +
                ", family=" + family +
                '}';
    }

}
