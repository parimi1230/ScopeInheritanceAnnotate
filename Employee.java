package com.sample.dependencyinjection;


public class Employee {

    private String name;
    private int age;
    private IAddress address;
    private int height;

    public Employee(final String name, final int age, final IAddress address, int height) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", height=" + height +
                '}';
    }
}
