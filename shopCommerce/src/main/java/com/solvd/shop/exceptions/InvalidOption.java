package com.solvd.shop.exceptions;

public class InvalidOption extends RuntimeException {
    public InvalidOption(String s) {
        super (s);
    }

    public String getMessage()
    {
        return "Invalid Option, please try again";
    }
}
