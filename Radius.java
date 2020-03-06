

import java.util.Scanner;
public class Radius{
    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a radius for us to calculate the area of the circle.");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;

            if(radius <= 0){
            System.out.println("INVALID! please put a number higher than zero.");

         }   else if(radius > 0){
                System.out.printf("The area of the circle is " + "%.2f",area);
        }

    }
}