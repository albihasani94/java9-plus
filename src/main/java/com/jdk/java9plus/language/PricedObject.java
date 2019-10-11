package com.jdk.java9plus.language;

public interface PricedObject {

    double getPrice();

    default double getPriceWithTax() {
        return calculatePriceWithTax();
    }

    default double getOfferPrice(double discount) {
        return calculatePriceWithTax() * discount;
    }

    private double calculatePriceWithTax() { // voila; provides methods for internal interface development :)
        return getPrice() * 1.07;
    }

}
