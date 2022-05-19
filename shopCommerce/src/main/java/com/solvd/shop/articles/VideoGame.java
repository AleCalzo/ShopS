package com.solvd.shop.articles;
import com.solvd.shop.articles.Products;

public class VideoGame extends Products {

    private String type;

    public VideoGame() {
    }
    public VideoGame(String name, double costUnit, int cantStock,
                      boolean available, String type) {
        super(name, costUnit, cantStock, available);
        this.type = type;
    }

    @Override
    public String toString() {
        return "GAME ARTICLE\n" + super.toString() + "Type: "
                + this.type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}

