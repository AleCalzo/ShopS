package com.solvd.shop.articles;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cine extends Products {

    // Attribute
    private String director;

    // Constructor
    public Cine() {
    }
    private static final Logger LOG = LogManager.getLogger("");

    public Cine(String name, double costUnit, int cantStock,
                boolean available, String director) {
        super(name, costUnit, cantStock, available);
        this.director = director;
    }

    @Override
    public String toString() {
        return "CINE ARTICLE\n" + super.toString() + "Director: "
                + this.director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}


