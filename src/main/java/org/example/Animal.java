package org.example;

import jakarta.persistence.*;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @SequenceGenerator(name="animal_generator", sequenceName = "animal_seq", allocationSize=1)
    private long id;
    private int age;
    private String name;
    private boolean tail;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", tail=" + tail +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    //    public Animal(int age, String name, boolean tail) {
//        this.age = age;
//        this.name = name;
//        this.tail = tail;
//    }
}
