package ex2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public final LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public final void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return
                super.getName() +
                        "(used) $" +
                        String.format("%.2f", super.getPrice()) +
                        " (Manufacture date: " + this.formatter.format(this.manufactureDate) + ")";
    }

    @Override
    public String toString() {
        return this.priceTag();
    }
}
