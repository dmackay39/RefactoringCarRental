package org.example;

public class Car {

    public static final int COMPACT = 1;
    public static final int STANDARD = 2;
    public static final int LUXURY = 3;

    private String makeModel;
    private int priceCode;

    public Car(String makeModel, int priceCode) {
        this.makeModel = makeModel;
        this.priceCode = priceCode;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
