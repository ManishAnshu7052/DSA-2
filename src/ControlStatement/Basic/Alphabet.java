package ControlStatement.Basic;
import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet:");
        char ch = sc.next().charAt(0);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
             System.out.println("This is Vowel");
        }
         else {
             System.out.println("This is Consonant");
         }
    }
}
