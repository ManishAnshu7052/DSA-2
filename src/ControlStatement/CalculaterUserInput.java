package ControlStatement;
import java.util.Scanner;
public class CalculaterUserInput {
    public static void main(String[] args) {
        String yn;
        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Number");
            int no1 = sc.nextInt();
            System.out.println("Enter the Second Number");
            int no2 = sc.nextInt();
            System.out.println("Select Symbole (+,-,*,/)");
            String sym = sc.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition is:" + res);
                    break;

                case "-":
                    res = no1 - no2;
                    System.out.println("Subtraction is:" + res);
                    break;

                case "*":
                    res = no1 * no2;
                    System.out.println("Multificatiob is:" + res);
                    break;

                case "/":
                    res = no1 / no2;
                    System.out.println("Division is:" + res);
                    break;

            }
            System.out.println("Do you want to continue (Press y for yes n for no)");
            yn = sc.next();
        }
            while(yn.equals("y") || yn.equals("Y"));
    }
}
