package com.solvd.shop.articles;

import com.solvd.shop.interfaces.Cupon;
import com.solvd.shop.interfaces.Size;

public class Shirt extends Products implements Cupon, Size{

    private String shirt;

    public Shirt() {
    }

    public Shirt(String name, double costUnit, int cantStock,
                 boolean available, String heroes) {
        super(name, costUnit, cantStock, available);

        this.shirt =shirt;
    }

    @Override
    public String toString() {
        return "SHIRT ARTICLES\n" + super.toString() + "Shirt: "
                + this.shirt;
    }

    public String getShirt() {
        return shirt;
    }

    public void setShirt(String mask) {
        this.shirt = shirt;
    }

    <cupon> int applyCupon (){
        return 0;
    }


    @Override
    public String sayHello(String greeting) {
        return null;
    }

    @Override
    public char tellSize(char size_type) {
        return 0;
    }

    @Override
    public void cupon(Character c, int total, int discount) {

    }
}
