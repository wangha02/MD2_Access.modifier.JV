package testCircle;

public class Main {
    public static void main(String[] args) {
        Circle cr = new Circle (4, " red");
        System.out.println("Dien Tich la: " + cr.getArea() + cr.getColor());
        System.out.println("Ban Kinh la: " + cr.getRadius() + cr.getColor());

    }
}