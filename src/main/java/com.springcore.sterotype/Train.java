package com.springcore.sterotype;

import org.springframework.stereotype.Component;

@Component
public class Train {

    private int id;
    private  String name;
    private int noOfSeats;

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

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", noOfSeats=" + noOfSeats +
                '}';
    }

    public Train(int id, String name, int noOfSeats) {
        this.id = id;
        this.name = name;
        this.noOfSeats = noOfSeats;
    }
    public Train(){}
}
