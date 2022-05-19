package com.solvd.shop.enums;

public enum ProductStatus {

    AVAILABLE("in stock"), UNAVAILABLE("no stock available");

    private final String message;

    ProductStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
