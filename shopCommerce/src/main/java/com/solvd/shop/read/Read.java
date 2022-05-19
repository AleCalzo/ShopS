package com.solvd.shop.read;

import com.solvd.shop.articles.Products;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class Read extends Products {

    private static final Logger LOG = LogManager.getLogger("");

    public static String dato() {
        String sdato = " ";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            sdato = flujoE.readLine();
        } catch (IOException e) {
            LOG.debug("Error " + e.getMessage());
        }
        return sdato;

    }

    public static int datoInt() {
        return Integer.parseInt(dato());
    }

    public static float datoFloat() {
        return Float.parseFloat(dato());
    }


    public static char datoChar() {
        char c = ' ';
        try {
            java.io.BufferedInputStream b = new BufferedInputStream(System.in);
            c = (char) b.read();
        } catch (IOException e) {
            LOG.debug("Reading Error");
            e.printStackTrace();
        }
        return c;
    }

    public static long datoLong() {
        return Long.parseLong(dato());
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}


