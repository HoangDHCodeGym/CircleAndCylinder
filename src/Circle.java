import sun.security.acl.PermissionImpl;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2)*Math.PI;
    }

    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A cirle with radius = " + this.radius + " and color = " + this.color;
    }
}