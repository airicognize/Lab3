/*
This program provides a menu with 5 options of conversion operations. Based
on the user instructions, the program should proceed with proper instructions,
input and output operations.
*/

import java.util.*;
import java.text.*;

public class Options{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("\n***Conversion operations***");
    System.out.println("\n(1) Feet to Meters");
    System.out.println("\n(2) CAD to USD");
    System.out.println("\n(3) Celsius to Fahrenheit");
    System.out.println("\n(4) Pounds to Kilograms");
    System.out.println("\n(5) CAD to EURO");

    int choice = sc.nextInt();

    if (choice == 1) {
      System.out.println("State your height in Feet.");
      float heightf = sc.nextFloat();
      float heightm = heightf*(0.3048f);
      System.out.println("Your height in meters is: " + heightm);

    } else if (choice == 2) {
      System.out.println("Please state the amount in CAD you wish to convert.");
      float cad = sc.nextFloat();
      float cadusd = cad*(0.76f);
      System.out.println(cad + " in USD is " + cadusd + " USD");

    } else if (choice == 3) {
      System.out.println("Please state the temperature in Celsius.");
      float celsius = sc.nextFloat();
      float celtoheit = (celsius*1.8f)+32f;
      System.out.println(celsius + " Celsius to Fahrenheit is " + celtoheit);

    } else if (choice == 4) {
      System.out.println("Please state any certain amount of pounds to convert.");
      float pounds = sc.nextFloat();
      float ptokg = pounds*(0.453592f);
      System.out.println(pounds + " Pounds to kilograms is " + ptokg);

    } else if (choice == 5) {
      System.out.println("Please state the amount in CAD you wish to convert.");
      float cad = sc.nextFloat();
      float cadeuro = cad*(0.68f);
      System.out.println(cad + " CAD in EURO is " + cadeuro + " euros");
    } else if (choice != 1 && 2 != 3 && 4 != 5) {
      System.out.println("INVALID");

    } else {

    }
  }
}
