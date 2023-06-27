package exercicios;

import entities.Rectangle;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and heigth");
        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();

        System.out.printf("Area = %.2f\n", rectangle.Area());
        System.out.printf("Perimeter = %.2f\n", rectangle.Perimeter());
        System.out.printf("Diagonal = %.2f\n3", rectangle.Diagonal());

        sc.close();
    }
}