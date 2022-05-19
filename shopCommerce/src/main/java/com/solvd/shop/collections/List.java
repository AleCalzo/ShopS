package com.solvd.shop.collections;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class List {

    private static final Logger LOG = LogManager.getLogger(Collections.class);

    public void givingNewProducts() {
        LinkedList<String> product = new LinkedList<>();
        product.add("Mask an Hat");
        product.add("Mask and Glasses");
        ListIterator<String> it = product.listIterator();

        LOG.debug("Need a different product?, we have available: "
                + product.size() + " " + "left");
        it.next();
        it.add("Mask an Hat");
        it.next();
        it.add("Mask and Glasses");
        for (String p: product) {
            LOG.debug(p);


        }
    }

}