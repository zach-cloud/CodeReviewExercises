package project1.bad;

import java.util.Scanner;

public class Calculator {

    /**
     * Program entry point.
     *
     * @param args  Ignored
     */
    public static void main(String[] args) {
        // How many problems can you find in this code?
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter an operation (+, -, /, *, ^): ");
        String asdf = abc.nextLine();
        System.out.print("Enter two numbers: ");
        int d = Integer.parseInt(abc.nextLine());
        int e = Integer.parseInt(abc.nextLine());
        if(asdf == "+") {
            System.out.println(d + e);
        }
        if(asdf == "-") {
            System.out.println(d - e);
        }
        if(asdf == "*") {
            System.out.println(d * e);
        }
        if(asdf == "/") {
            System.out.println(d / e);
        }
        if(asdf == "^") {
            System.out.println(d ^ e);
        }
    }
}
