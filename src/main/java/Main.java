import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.GERMAN);

    double height, bmi;
    int weight;

    System.out.println("Velkommen til 'BMI-beregner'");

    System.out.print("Indtast din højde i meter: ");
    height = scan.nextDouble();

    if (height > 100) {

      System.out.println("\nVi kan se at du har indtastet et tal højere end 100 og regner med " +
          "at du indtastet din højde i centimeter.\nVi justerer det derfor til meter\n");
      height = height / 100;
    }

    System.out.print("Indtast din vægt i kg: ");
    weight = scan.nextInt();
    //bmi = weight/ Math.pow(height, 2);
    bmi = weight / (height * height);

    System.out.println("BMI " + bmi);


// Version 2
    if (bmi > 35) {
      System.out.print("Du er ekstrem overvægtig " + bmi);
      System.out.println("Hej med dig");
    } else if (bmi > 30) {
      System.out.print("Du er svært overvægtig " + bmi);
    } else if (bmi > 25) {
      System.out.print("Du er overvægtig " + bmi);
    } else if (bmi > 18.5) {
      System.out.print("Du er normalvægtig " + bmi);
    } else if (bmi > 0) {
      System.out.print("Du er virkelig undervægtig " + bmi);
    } else {
      System.out.println("et tal udenfor vores rækkevidde blev beregnet - søg hjælp");
    }

    // Version 2 OLD
    if (bmi < 18.5) {
      System.out.print("Du er undervægtig " + bmi);
      // } else if (bmi >= 18.5 && bmi <= 24.9) {
    } else if (bmi < 25) {
      System.out.print("Du er normalvægtig " + bmi);
    } else if (bmi > 25 && bmi <= 29.9) {
      System.out.print("Du er overvægtig " + bmi);
    } else if (bmi >= 30 && bmi <= 34.9) {
      System.out.print("Du er virkelig overvægtig " + bmi);
    } else if (bmi >= 35) {
      System.out.print("Du er ekstrem overvægtig" + bmi);
    } else {
      System.out.println("et tal udenfor vores rækkevidde blev beregnet - søg hjælp");
    }
  }
}

