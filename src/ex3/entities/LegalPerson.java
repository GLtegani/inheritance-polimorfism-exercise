package ex3.entities;

public class LegalPerson extends Person{
    private int employeeQuantity;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, double annualIncome, int employeeQuantity) {
        super(name, annualIncome);
        this.employeeQuantity = employeeQuantity;
    }

    public final int getEmployeeQuantity() {
        return employeeQuantity;
    }

    public final void setEmployeeQuantity(int employeeQuantity) {
        this.employeeQuantity = employeeQuantity;
    }

    @Override
    public final double taxToPay() {
        if(this.employeeQuantity > 10) {
            return super.getAnnualIncome() * 0.14;
        } else {
            return super.getAnnualIncome() * 0.16;
        }
    }
}
