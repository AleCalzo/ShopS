package com.solvd.shop.articles;
import com.solvd.shop.interfaces.Author;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;

public class Books extends Products implements Author {

    private static final Logger LOG = LogManager.getLogger("");

    List <String> list = new ArrayList<>();

    public void setList(List<String> list) {
        this.list = list;
        list.add("Stephen King");
        list.add("Edgar Allan Poe");
        list.add("Lewis Carrol");

    }

    private String book;


    public Books(String name, double costUnit, int cantStock,
                  boolean available, String Author) {
        super(name, costUnit, cantStock, available);
        this.book = book;
    }
    @Override
    public String toString() {
        return "BOOK ARTICLES\n" + super.toString() + "Book: "
                + this.book;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }

    @Override
    public void callNameAuthor() {
        LOG.debug("The name of the Author is:" + getName());

    }
}


