package com.Spring_JPA_Hibernate_3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    int streetNumber;
    String location;
    String State;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
