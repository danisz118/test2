package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class massSolution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bigarray[] = new int[20];
        for (int i = 0; i < bigarray.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            bigarray[i] = a;
        }
        int array1[] = new int[10];
        int array2[] = new int[10];

        array1 = Arrays.copyOfRange(bigarray, 0, 10);
        array2 = Arrays.copyOfRange(bigarray, 10, 20);

        for (int j = 0; j < array2.length - 1; j++) {
            System.out.println(array2[j]);
        }
    }
}
/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/