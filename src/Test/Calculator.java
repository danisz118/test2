package Test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        char x = s.next().charAt(0);
        int operand1 = 10;
        int operand2 = 10;

        switch (x) {
            case '+' :
                System.out.println(operand1+operand2);
                break;
            case '-':

                System.out.println(operand1-operand2);
                break;
            case '*':
                System.out.println(operand1*operand2);
                break;
            case '/':
                if (operand2==0|| operand1==0){
                    System.out.println("Нельзя делить на ноль !!!");
                }
                System.out.println(operand1/operand2);
                break;
        }

    }


}
