package ex1.entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public final Double getAdditionalCharge() {
        return additionalCharge;
    }

    public final void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payment() {
        return super.payment() + 1.1 * this.additionalCharge;
    }
}
