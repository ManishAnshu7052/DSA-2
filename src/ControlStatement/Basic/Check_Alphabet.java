package ControlStatement.Basic;
import java.util.Scanner;
public class Check_Alphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet:");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("Number is alphabet");
        }
        else {
            System.out.println("This is not an Alphabet");
        }
    }
}
