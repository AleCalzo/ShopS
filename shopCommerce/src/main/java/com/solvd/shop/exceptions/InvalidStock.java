package com.solvd.shop.exceptions;

public class InvalidStock extends RuntimeException {
    public InvalidStock(String message){
        super(message);
    }
}
