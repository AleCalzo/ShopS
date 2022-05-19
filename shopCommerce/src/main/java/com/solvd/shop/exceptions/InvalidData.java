package com.solvd.shop.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidData extends RuntimeException{

    public InvalidData(String message) {
        super(message);
    }

    public String getMessage() {
        return "Insert only letters please";
    }
}
