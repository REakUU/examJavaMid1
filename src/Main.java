import DateConvertion.dateConvert;
import RectangleSquare.Rectangle;
import RectangleSquare.Square;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        dateConvert obj = new dateConvert();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        System.out.println(obj.convert(shortDate));
        Rectangle rectangle = new Rectangle(5, 8);
        Square square = new Square(4);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
        }




    }