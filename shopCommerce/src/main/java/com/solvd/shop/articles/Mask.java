package com.solvd.shop.articles;

public class Mask extends Products {

    private String mask;

    public Mask() {
    }

    public Mask(String name, double costUnit, int cantStock,
                boolean available, String creator) {
        super(name, costUnit, cantStock, available);

        this.mask =mask;
    }

    @Override
    public String toString() {
        return "MASK ARTICLES\n" + super.toString() + "Mask: "
                + this.mask;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}



