package org.genspark.javaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Student {
    @Value("#{1}")
    private int id;
    @Value("#{'John Doe'}")
    private String name;
    private List<Phone> ph;
    private Address add;

    public Student() {}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }
    @Autowired
    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }
    @Autowired
    public void setAdd(Address add) {
        this.add = add;
    }
}
