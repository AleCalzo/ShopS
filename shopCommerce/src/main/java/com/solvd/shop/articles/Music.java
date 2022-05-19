package com.solvd.shop.articles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Music extends Products {
    private static final Logger LOG = LogManager.getLogger("");

    private String gender;

    public Music() {
    }

    public Music(String name, double costUnit, int cantStock,
                 boolean available, String gender) {
        super(name, costUnit, cantStock, available);
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MUSIC ARTICLE\n" + super.toString() + "Gender: "
                + this.gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}

