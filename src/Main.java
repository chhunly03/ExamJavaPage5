public class Main {
    public static void main(String[] args) {
        double sideLength = 5.0;
        Rectangle rectangle = new Rectangle(50, 40);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("============================================");
        Square square = new Square(10);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}