package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class massmax {
    int[] array = initializeArray();
    int max = max(array);
        System.out.println(max);
}

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array =  new int[20];
        for(int i = 0; i<20; i++){

            String s = reader.readLine();
            array[i]= Integer.parseInt(s);
        }

        // создай и заполни масси
        return array;
    }

    public static int max(int[] array) {

        int max = array[0];
        for(int i = 0; i<20; i++){
            if (array[i]>max)
                max = array[i];
        }

        // найди максимальное значение
        return max;
    }
}
