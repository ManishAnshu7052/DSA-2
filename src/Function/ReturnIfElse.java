package Function;

public class ReturnIfElse {
    static void myAge(int age){
        if (age<18){
            System.out.println("Access denied- You are not old");
        }
        else {
            System.out.println("Access granted - You are old");
        }
    }
    public static void main(String[] args) {
        myAge(17);
    }
}
