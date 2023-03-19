package ControlStatement;

import com.sun.jdi.connect.Connector;

public class GreaterTwoNumber {
    public static void main(String[] args) {
        int a= 20;
        int b= 34;
        int c= 44;
        if (a>b)
        {
            System.out.println("a is greater then b");
        }
        else {
            System.out.println("b is greater then a");
        }
        if (b<c)
        {
            System.out.println("c is greater then b");
        }
        else {
            System.out.println("b is greater then c");
        }
    }
}
