public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return this.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "This is a Cylinder with height = " + this.height+ "and is subclass of " + super.toString();
    }
}
