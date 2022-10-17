package test.currency;

import main.currency.CurrencyConverter;
import main.currency.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CurrencyConverterTest {

    @Test
    public void testCompleteCurrencyList_AssertPrebookingItemsGotRemoved() {
        CurrencyConverter cc = new CurrencyConverter();
        List<Transaction> newTransactions = cc.completeCurrencyList(transactions, currencyConversionMap);

        Assertions.assertEquals(4, newTransactions.size());
    }

    @Test
    public void testCompleteCurrencyList_AssertCorrectConversions() {
        CurrencyConverter cc = new CurrencyConverter();
        List<Transaction> newTransactions = cc.completeCurrencyList(transactions, currencyConversionMap);

        Assertions.assertEquals(97.17, newTransactions.get(0).currencyMap.get("USD"));
        Assertions.assertEquals(14363.0, newTransactions.get(0).currencyMap.get("JPY"));
        Assertions.assertEquals(86.823, newTransactions.get(0).currencyMap.get("GBP"));
        Assertions.assertEquals(100.0, newTransactions.get(1).currencyMap.get("USD"));
        Assertions.assertEquals(14781.31110425028, newTransactions.get(1).currencyMap.get("JPY"));
        Assertions.assertEquals(89.35165174436554, newTransactions.get(1).currencyMap.get("GBP"));
        Assertions.assertEquals(102.91242152927857, newTransactions.get(1).currencyMap.get("EUR"));
    }

    private List<Transaction> transactions = new ArrayList() {{
        add(new Transaction("BRL", 100, true));
        add(new Transaction("EUR", 100, false));
        add(new Transaction("USD", 100, false));
        add(new Transaction("JPY", 100, false));
        add(new Transaction("GBP", 100, false));
    }};

    private Map<String, Double> currencyConversionMap = new HashMap<String, Double>() {{
        put("EUR", 1.0);
        put("USD", 0.9717);
        put("JPY", 143.63);
        put("BGN", 1.9558);
        put("CZK", 24.587);
        put("DKK", 7.4378);
        put("GBP", 0.86823);
        put("HUF", 418.24);
        put("PLN", 4.8328);
        put("RON", 4.9335);
        put("SEK", 11.0035);
        put("CHF", 0.9757);
        put("ISK", 140.50);
        put("NOK", 10.3323);
        put("HRK", 7.5266);
        put("TRY", 18.0614);
        put("AUD", 1.5493);
        put("BRL", 5.1177);
        put("CAD", 1.3426);
        put("CNY", 6.9952);
        put("HKD", 7.6278);
        put("IDR", 15031.50);
        put("ILS", 3.4440);
        put("INR", 79.9695);
        put("KRW", 1398.50);
        put("MXN", 19.5031);
        put("MYR", 4.5689);
        put("NZD", 1.7302);
        put("PHP", 57.375);
        put("SGD", 1.3852);
        put("THB", 37.109);
        put("ZAR", 17.6932);
    }};
}