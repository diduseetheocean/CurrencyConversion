package main.currency;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CurrencyConverter {

    public List<Transaction> completeCurrencyList(List<Transaction> transactions, Map<String, Double> currencyConversions) {
        List<Transaction> newTransactions = removePrebookingTransactions(transactions);
        return calcCurrencies(newTransactions, currencyConversions);
    }

    private List<Transaction> removePrebookingTransactions(List<Transaction> transactions) {
        return transactions.stream().filter(transaction -> !transaction.isPrebooking).collect(Collectors.toList());
    }

    private List<Transaction> calcCurrencies(List<Transaction> transactions, Map<String, Double> currencyConversions) {
        for(Transaction item : transactions) {
            currencyConversions
                .forEach((k, v) ->
                        item.currencyMap.put(k, v / currencyConversions.get(item.originCurrency) * item.originSum)
                );
        }
        return transactions;
    }
}

