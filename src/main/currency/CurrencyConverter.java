package main.currency;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CurrencyConverter {

    public List<Transaction> removePrebookingTransactions(List<Transaction> transactions) {
        return transactions.stream().filter(transaction -> !transaction.isPrebooking).collect(Collectors.toList());
    }

    public void calcCurrencies(List<Transaction> transactions, Map<String, Double> currencyConversions) {
        for(Transaction item : transactions) {
            if(Objects.equals(item.originCurrency, "EUR")) {
                currencyConversions.forEach((k, v) ->
                        item.currencyMap.put(k, item.originSum * v)
                );
            }
            else {
                item.currencyMap.put("EUR", 1 / currencyConversions.get(item.originCurrency) * item.originSum);
                currencyConversions
                    .forEach((k, v) ->
                        item.currencyMap.put(k, v / currencyConversions.get(item.originCurrency) * item.originSum)
                    );
            }
        }
    }
}

