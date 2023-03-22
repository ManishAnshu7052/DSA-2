package ControlStatement.Basic;
import java.util.Scanner;
public class Upper_Lower_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet:");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Alphabet is lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Alphabet is Uppercase");
        }
    }
}
