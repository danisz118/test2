package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interval {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDigit = reader.readLine();
        int nDigit = Integer.parseInt(sDigit);
        if(nDigit<0 || nDigit>100){
            System.out.println("Не входит в заданный интервал.");
        }
        else if (nDigit>=0 && nDigit<=14){
             System.out.println("[0-14]");
        }
        else if (nDigit>=15 && nDigit<=35){
            System.out.println("[15-35]");
        }
        else if (nDigit>=36 && nDigit<=50){
            System.out.println("[36-50]");
        }
        else if (nDigit>=50 && nDigit<=100){
            System.out.println("[50-100]");
        }

    }
}
