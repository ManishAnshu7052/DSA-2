package ControlStatement.CountDigit;
import java.util.Scanner;
public class DigitUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits:");
        int n= sc.nextInt();
        int dig = 0;
        while (n!=0){
            n = n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
