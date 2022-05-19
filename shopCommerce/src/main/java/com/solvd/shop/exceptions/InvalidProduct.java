package com.solvd.shop.exceptions;

public class InvalidProduct extends RuntimeException{
    @Override
    public String getMessage() {
        return "Inexisted product";
    }
}
