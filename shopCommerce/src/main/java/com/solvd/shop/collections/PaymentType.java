package com.solvd.shop.collections;


public class PaymentType implements Comparable<PaymentType> {

    public PaymentType(int num, String type) {
        number = num;
        types = type;
    }


    public double compareTo ; PaymentType() {

    }

    private int number;
    private String types;

    public String getTypes() {
        return types;
    }

    @Override
    public int compareTo(PaymentType o) {
        return 0;
    }
}

