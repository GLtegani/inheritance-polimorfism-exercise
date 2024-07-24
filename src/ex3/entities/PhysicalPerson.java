package ex3.entities;

public class PhysicalPerson extends Person{
    private double healthSpending;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, double annualIncome, double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public final double getHealthSpending() {
        return healthSpending;
    }

    public final void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public final double taxToPay() {
        if(super.getAnnualIncome() < 20000 && this.healthSpending > 0) {
            return (super.getAnnualIncome() * 0.15) - (this.healthSpending * 0.50);
        } else if(super.getAnnualIncome() < 20000) {
            return super.getAnnualIncome() * 0.15;
        } else if(super.getAnnualIncome() >= 20000 && this.healthSpending > 0) {
            return (super.getAnnualIncome() * 0.25) - (this.healthSpending * 0.50);
        } else {
            return super.getAnnualIncome() * 0.25;
        }
    }
}
