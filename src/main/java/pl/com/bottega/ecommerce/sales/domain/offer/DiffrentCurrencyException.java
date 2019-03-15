package pl.com.bottega.ecommerce.sales.domain.offer;

public class DiffrentCurrencyException extends Exception {

    private static final long serialVersionUID = -8086528587315766613L;

    String firstCurrency;
    String secondCurrency;

    DiffrentCurrencyException(String firstCurrency, String secondCurrency) {
        super();
        this.firstCurrency = firstCurrency;
        this.secondCurrency = secondCurrency;
    }
}
