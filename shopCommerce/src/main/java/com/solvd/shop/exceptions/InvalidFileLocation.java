package com.solvd.shop.exceptions;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InvalidFileLocation  extends RuntimeException{

    public InvalidFileLocation(String message) {
        super(message);
    }




}
