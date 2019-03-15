package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {

    private String id;
    private String name;
    private String type;
    private Date snapshotDate;
    private Money price;

    public Product(String id, String name, String type, Date snapshotDate, Money price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.snapshotDate = snapshotDate;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public Money getPrice() {
        return price;
    }
}
