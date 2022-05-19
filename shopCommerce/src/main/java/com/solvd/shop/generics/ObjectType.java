package com.solvd.shop.generics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObjectType <T> {
    private static final Logger LOG = LogManager.getLogger("");

    private T object;

    public ObjectType(T object) {
        this.object = object;

        LOG.debug(object);
    }


}
