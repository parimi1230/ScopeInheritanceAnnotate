package com.sample.dependencyinjection;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TemporaryAddress implements IAddress{

    private String area;
    private String city;
    private String state;
    private String phone;
    private String email;
    private List<String> vals;
    private ContactDetails contactDetails;
    @Autowired
    private Manipulation manipulation;

    @Autowired
    public void setContactDetails(final ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        this.contactDetails.setDistance(manipulation.add(10, 20));
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public TemporaryAddress(){
        System.out.println("Inside Temporary Address");
    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getVals() {
        return vals;
    }

    public void setVals(List<String> vals) {
        this.vals = vals;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "TemporaryAddress{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", vals=" + vals +
                ", details=" + contactDetails +
                '}';
    }
}
