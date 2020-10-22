package com.endava;

public class Intern {

    private final String name;
    private final Integer age;
    private final InternStream internStream;

    public Intern(String name, Integer age, InternStream internStream) {
        this.name = name;
        this.age = age;
        this.internStream = internStream;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public InternStream getInternStream() {
        return internStream;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", internStream=" + internStream +
                '}';
    }
}
