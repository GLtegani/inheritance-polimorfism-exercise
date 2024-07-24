package ex3.entities;

public abstract class Person {
    private String name;
    private double annualIncome;

    public Person() {
    }

    public Person(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getAnnualIncome() {
        return annualIncome;
    }

    public final void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double taxToPay();

    @Override
    public final String toString() {
        return this.name + ": $" + String.format("%.2f", this.taxToPay());
    }
}
