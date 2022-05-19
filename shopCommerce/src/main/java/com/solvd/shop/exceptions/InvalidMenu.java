package com.solvd.shop.exceptions;

public class InvalidMenu extends RuntimeException{
    public InvalidMenu(String message){
        super(message);
    }
}
