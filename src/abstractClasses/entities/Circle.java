package abstractClasses.entities;

import abstractClasses.enums.Color;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }

    public final void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public final double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
