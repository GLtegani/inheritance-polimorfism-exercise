package ex2.entities;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Double getPrice() {
        return price;
    }

    public final void setPrice(Double price) {
        this.price = price;
    }

    public String priceTag() {
        return this.getName() + " $" + String.format("%.2f", this.getPrice());
    }

    public String toString() {
        return this.priceTag();
    }
}
