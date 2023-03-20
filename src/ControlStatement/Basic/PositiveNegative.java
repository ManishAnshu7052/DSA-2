package ControlStatement.Basic;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number =");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
