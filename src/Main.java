import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //MAKING A BMI CALCULATOR

        Scanner scan = new Scanner(System.in);

        double weight;
        double height;
        double bmi;

        System.out.print("Please enter your weight: ");
        weight = scan.nextDouble();

        System.out.print("Please enter your height: ");
        height = scan.nextDouble();

        bmi = weight / Math.pow(height, 2);
        bmi *=10000 ;

        System.out.printf("Your BMI is: %f.", bmi);
    }
}
