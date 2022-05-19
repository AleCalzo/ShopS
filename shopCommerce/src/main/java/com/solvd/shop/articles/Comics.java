package com.solvd.shop.articles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Comics extends Products {

    private static final Logger LOG = LogManager.getLogger("");

        private String comics;

        public Comics() {
        }

        public Comics(String name, double costUnit, int cantStock,
                    boolean available, String creator) {
            super(name, costUnit, cantStock, available);
            this.comics = comics;
        }

        @Override
        public String toString() {
            return "COMICS ARTICLES\n" + super.toString() + "Comic: "
                    + this.comics;
        }

        public String getComics() {
            return comics;
        }

        public void setComics(String comics) {
            this.comics = comics;
        }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}


