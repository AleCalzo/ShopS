package com.solvd.shop.enums;

public enum MusicGender {

    PORTIS("Trip Hop"),
    RADIO("Rock"), ;

    private String name;

    MusicGender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}