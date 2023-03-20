package ControlStatement.Basic;
import java.util.Scanner;
public class Divisible_by {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
         if (num % 5 == 0 && num % 11 == 0){
            System.out.println("Number is divisible by both!!!!!");
        }
         else if (num % 5 == 0){
            System.out.println("Number is Divisible by 5 ");
        }else if (num % 11 == 0){
            System.out.println("Number is not Divisible by 11");
        }
        else {
            System.out.println("Not divided!");
        }
        }
    }

