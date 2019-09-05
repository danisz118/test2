package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hillel {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[10];
        for (int i = 0; i< arr.length;i++){
            arr[i] = Integer.parseInt(reader.readLine());

        }
        for(int i = 0; i <arr.length; i++){
            int j = arr.length -i -1;
            System.out.println(arr[j]);
        }

    }
        }


        //1. Создать массив на 10 чисел.

        //2. Ввести с клавиатуры 10 чисел и записать их в массив.
        //3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.