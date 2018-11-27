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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public IAddress getAddress() {
        return address;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
