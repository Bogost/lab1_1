package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private Money amount;
    private String cause;

    public Discount(Money amount, String cause) {
        this.amount = amount;
        this.cause = cause;
    }

    public Money getAmount() {
        return amount;
    }

    public String getCause() {
        return cause;
    }

}
