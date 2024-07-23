package ex2.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public final Double getCustomsFee() {
        return customsFee;
    }

    public final void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public final Double totalPrice() {
        return super.getPrice() + this.customsFee;
    }

    @Override
    public final String priceTag() {
        return super.getName() + " $" + String.format("%.2f", this.totalPrice()) + " (Customs fee: $" + String.format("%.2f", this.customsFee) + ")";
    }

    @Override
    public String toString() {
        return this.priceTag();
    }
}
