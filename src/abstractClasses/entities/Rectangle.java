package abstractClasses.entities;

import abstractClasses.enums.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public final double getWidth() {
        return width;
    }

    public final void setWidth(double width) {
        this.width = width;
    }

    public final double getHeight() {
        return height;
    }

    public final void setHeight(double height) {
        this.height = height;
    }

    @Override
    public final double area() {
        return this.width * this.height;
    }
}
