package ex1.entities;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Integer getHours() {
        return hours;
    }

    public final void setHours(Integer hours) {
        this.hours = hours;
    }

    public final Double getValuePerHour() {
        return valuePerHour;
    }

    public final void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return this.hours * this.valuePerHour;
    }
}
