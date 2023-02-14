import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        //set big's radius to 2.0
        Circle big = new Circle(2.0);
        System.out.printf("circle radius: %.2f\n", big.getRadius());
        System.out.printf("circle area: %.2f\n", big.getArea());
        System.out.printf("circle circumference: %.2f\n", big.getCircumference());

        //change big's radius to 5.5
        big.setRadius(5.5);
        System.out.printf("circle radius: %.2f\n", big.getRadius());
        System.out.printf("circle area: %.2f\n", big.getArea());
        System.out.printf("circle circumference: %.2f\n", big.getCircumference());

        //prompt user to enter radius
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        big.setRadius(input.nextDouble());
        System.out.printf("circle radius: %.2f\n", big.getRadius());
        System.out.printf("circle area: %.2f\n", big.getArea());
        System.out.printf("circle circumference: %.2f\n", big.getCircumference());

    }

}
