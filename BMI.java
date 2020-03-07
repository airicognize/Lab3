
import java.util.*;
import java.text.*;

/*
It calculates the Body Mass Index (BMI) of a person. The user should input the weight in pounds and height
in feet, and the program should output the weight converted to kilograms, heigh converted to meters, the calculated
BMI ( BMI = Kg/(m^2)), and its classification as underweight, normal, overweight or obese.
 */

public class BMI{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please state your weight in pounds and height in feet in order for us to caluclate your BMI.");
        float weightp = sc.nextFloat();
        float heightf = sc.nextFloat();

        float weightkg = weightp*(0.453592f);
        float heightm = heightf*(0.3048f);
        float BMI = (float)weightkg/(heightm*heightm);

        DecimalFormat f = new DecimalFormat("#0.00");

        if(BMI >= 18.5 && BMI <= 29.4){
            System.out.printf(" Weight in kg: " + f.format(weightkg) + " height in meters: " + f.format(heightm) + " BMI: " + f.format(BMI) + " Classification: Normal");
        } else if(BMI >= 25.0 && BMI <= 29.9){
            System.out.printf(" Weight in kg: " + f.format(weightkg) + " height in meters: " + f.format(heightm) + " BMI: " + f.format(BMI) + " Classification: Overweight.");
        } else if(BMI >= 30.0 && BMI <= 34.9){
            System.out.printf(" Weight in kg: " + f.format(weightkg) + " height in meters: " + f.format(heightm) + " BMI: " + f.format(BMI) + " Classification: Obesity.");
        } else if(BMI <= 18.5){
            System.out.printf(" Weight in kg: " + f.format(weightkg) + " height in meters: " + f.format(heightm) + " BMI: " + f.format(BMI) + " Classification: Underweight.");
        } else if(BMI >= 40){
            System.out.printf(" Weight in kg: " + f.format(weightkg) + " height in meters: " + f.format(heightm) + " BMI: " + f.format(BMI) + " Classification: Extreme Obesity.");
        } else{

        }


    }
}
