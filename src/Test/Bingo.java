package Test;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

/*
Написать программу игру “Bingo”.
Bingo.
Программа должна загадать целое число в диапазоне от 0 до 10 и предложить пользователю
его отгадать.
При вводе числа пользователем, программа проверяет на соответствие с загаданным число и
если числа совпали вывести сообщение о том что число отгадано. Если числа не совпали, тогда
следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
Также программа ведет подсчет попыток, и выводит это количество после того как число
угадали. Предусмотреть возможность досрочного завершения программы, в случае если
пользователь не желает продолжать угадывать число.
 */
public class Bingo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numGueses = 0;   // переменная догадок
        int randomNumber = new Random() .nextInt(10)+1;
        out.println("Добро пожаловать в игру");
        out.println();
        out.println("Введите любое чило от 1 до 10");
        int inputNumber = keyboard.nextInt();
        numGueses++;

        while (inputNumber != randomNumber){
            out.println();
            out.println("Попытайтесь еще раз ..");
            out.println("Введите любое чило от 1 до 10");
            inputNumber = keyboard.nextInt();
            numGueses++;
            if (inputNumber < randomNumber){
                System.out.println("Задуманное число больше вводимого ");
            }
            else if (inputNumber > randomNumber){
                System.out.println("Задуманное число меньше  вводимого ");

            }
        }
        out.println("Вы угадали число после  ");
        out.println(numGueses + "  попыток");
    }

}
