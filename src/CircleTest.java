public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(3.4, "blue");
        System.out.println(circle.toString());
        System.out.println("Circle area is " + circle.getArea());
        System.out.println("Circle perimeter is " + circle.getPerimeter());

        Cylinder cylinder = new Cylinder(5.6, 2, "green");
        System.out.println(cylinder.toString());
        System.out.println("Cylinder volume is " + cylinder.getVolume());
    }
}
