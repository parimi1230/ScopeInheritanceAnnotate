package com.sample.dependencyinjection;


public class PermanentAddress implements IAddress{

    private String pCity;
    private String pState;
    private String phone;
    private String email;


    public PermanentAddress(){
        System.out.print("You are in permanent address");
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState;
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
        return "PermanentAddress{" +
                "pCity='" + pCity + '\'' +
                ", pState='" + pState + '\'' +
                "phone='" + phone+ '\'' +
                ", email='" + email + '\'' +

                '}';
    }
}
