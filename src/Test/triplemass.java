package Test;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class triplemass {

    public static void main(String[] args) throws Exception {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int array[]= new int [20];
        for(int i=0;i<array.length;i++)
        {
            array[i]=Integer.parseInt(reader.readLine());
        }
        int array1[]= new int[10];
        int array2[]= new int [10];
        System.arraycopy(array,0,array1,0,10);
        System.arraycopy(array,10,array2,0,10);
        for(int i = 0; i < array2.length; i++) {

            System.out.println(array2[i]);
        }
        //напишите тут ваш код
    }
}
