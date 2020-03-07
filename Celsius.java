/*
It will prompts the user for the current temperature in Celsius and outputs different messages
if it is above or below zero.
*/

import java.util.*;

public class Celsius{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please input the current temperature in Celsius");
    double celsius = sc.nextDouble();

    String message = celsius < 0 ? "We recommend you putting warm clothes." : "PUT ON THAT TANK TOP WITH DEM FLIPFLOPS LETS GO";

    System.out.println(message);
  }
}
