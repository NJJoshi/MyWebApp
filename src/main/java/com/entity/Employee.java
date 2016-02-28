package com.entity;

import java.io.Serializable;

/**
 * Created by Nirav on 31-01-2016.
 */
public class Employee implements Serializable {
    private int Id;
    private String name;
    private double salary;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
