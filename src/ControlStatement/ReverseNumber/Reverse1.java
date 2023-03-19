package ControlStatement.ReverseNumber;
import java.util.Scanner;
public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        while(n>0){
            int dig = n%10;
            n = n/10;
            System.out.println(dig);
        }
    }
}
