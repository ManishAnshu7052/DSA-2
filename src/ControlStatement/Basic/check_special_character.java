package ControlStatement.Basic;
import java.util.Scanner;
public class check_special_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("This is Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a Digit");
        }
        else {
            System.out.println("This is special character");
        }
    }
}
