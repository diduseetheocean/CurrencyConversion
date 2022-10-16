package main.currency;

import java.util.HashMap;

public class Transaction {
    public String originCurrency;
    public long originSum;
    public boolean isPrebooking;

    public HashMap<String, Double> currencyMap = new HashMap<>();

    public Transaction(String originCurrency, long originSum, boolean isPrebooking) {
        this.originCurrency = originCurrency;
        this.originSum = originSum;
        this.isPrebooking = isPrebooking;
    }
}
