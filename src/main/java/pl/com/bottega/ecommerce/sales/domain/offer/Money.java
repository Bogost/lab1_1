package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {

    private BigDecimal value;
    private String currency;

    Money(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    void add(Money m) throws DiffrentCurrencyException {
        if (this.currency != m.currency) {
            throw new DiffrentCurrencyException(this.currency, m.currency);
        }
        this.value.add(m.value);
    }

    void subtract(Money m) throws DiffrentCurrencyException {
        if (this.currency != m.currency) {
            throw new DiffrentCurrencyException(this.currency, m.currency);
        }
        this.value.subtract(m.value);
    }

    void multiply(BigDecimal bd) {
        this.value.multiply(bd);
    }

    BigDecimal getValue() {
        return value;
    }

    String getCurrency() {
        return currency;
    }
}
