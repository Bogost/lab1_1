package pl.com.bottega.ecommerce.sales.domain.offer;

public class DiffrentCurrencyException extends Exception {

    String firstCurrency;
    String secondCurrency;

    DiffrentCurrencyException(String firstCurrency, String secondCurrency) {
        super();
        this.firstCurrency = firstCurrency;
        this.secondCurrency = secondCurrency;
    }
}
