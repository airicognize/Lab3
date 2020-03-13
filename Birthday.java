/*
It prompts the user for his/her date of birth in the format YYYY-MM-DD
and outputs the user age, plus a message in the lines: "Your birthday is in XX days.",
or "Your birthday was XX days ago", denedping if the date in the current year
has passed or not.
*/

import java.util.*;
import java.text.*;
import java.time.*;

public class Birthday{
  public static void main(String[] args) {

    int birthYear,currentYear,age,totalMonths,currentDay,today,birthDay,birthMonth,daysPast,remainingDays,currentMonth;

    Date date = new Date();
    Scanner sc = new Scanner(System.in);

    System.out.println("Please state your date of birth in the YYYY-MM-DD format.");
    String birth = sc.nextLine();

     String yyyy = birth.substring(0,4);
    String mm = birth.substring(5,7);
    String dd = birth.substring(8,10);

    birthYear = Integer.parseInt(yyyy);
    birthDay = Integer.parseInt(dd);
    birthMonth = Integer.parseInt(mm);
    currentYear = date.getYear() + 1900;
    currentMonth = date.getMonth();
    totalMonths = currentMonth + 1;
    currentDay = date.getDay();
    today = currentDay + 8;

    if (birthMonth > totalMonths){
    			age = (currentYear - birthYear) - 1;
    			System.out.println("You are " + age + " years old today.");
    			if (birthDay > today){
    				remainingDays = ((birthDay - today) + (birthMonth - totalMonths)*31);
    				System.out.println("There is " + remainingDays + " days before your birthday!");
    			} else if (birthDay < today){
    				remainingDays = (today - birthDay) + (birthMonth - totalMonths)*31;
    				System.out.println("There is  " + remainingDays + " days before your birthday!");
    		 }
        } else if (birthMonth < totalMonths){
    			age = (currentYear - birthYear);
    			System.out.println("You are " + age + " years old today.");
    			if (birthDay > today){
    				daysPast = (birthDay - today) - (totalMonths - birthMonth)*31;
    				System.out.println("Your birthday was " + Math.abs(daysPast) + " days ago.");
    			} else if (birthDay <= today){
    				daysPast = (today - birthYear) - (totalMonths - birthMonth)*31;
    				System.out.println("Your birthday was " + Math.abs(daysPast) + " days ago.");
    			}
    		} else if (birthMonth == totalMonths){
    			if (birthDay > today){
    				age = (currentYear - birthYear) - 1;
    				remainingDays = birthDay - today;
    				System.out.println("You are " + age + " years old today.");
    				System.out.println("Your Birthday is in " + remainingDays + " days.");
    			} else if (birthDay < today){
    				daysPast = today - birthDay;
    				age = (currentYear - birthYear);
    				System.out.println("You are " + age + " years old today.");
    				System.out.println("Your Birthday was " + daysPast + " days ago.");
          } else if (today == birthDay){
    				age = currentYear - birthYear;
    				System.out.println("Happy birthday, may your day be enjoyable! :)");
    				System.out.println("You are now " + age + " years old!");
    				System.out.println("ITS YO BIRTTDEY ;o");
          }
    }
 }
}
