package abstractClasses;

import abstractClasses.entities.Circle;
import abstractClasses.entities.Rectangle;
import abstractClasses.entities.Shape;
import abstractClasses.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Shape> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.println("Shape #" + (1 + i) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));

            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");

        for(Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }





        sc.close();
    }
}
