package Test;


import java.util.Scanner;

public class BabbleSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];//создаем  массив размером 10
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();// заполняем массив с клавиатуры
        }


        System.out.println("Заполненый массив");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");// Выводим заполненый массив на экран
        }

        }

    }

