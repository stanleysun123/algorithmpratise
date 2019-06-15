
// Java program to demonstrate BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
//buttom up approach


class FibonacciExample {

    public static void main(String args[]) throws IOException  {

        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        String number = reader.readLine();

        // Printing the read line
        System.out.println(number);

        int postion = Integer.parseInt(number);
        int result =  cal (postion);
        System.out.println("result="+result);


    }


    static int cal(int n ) {

        System.out.println("n="+n);

        if (n == 1 || n == 2 ) return 1;


        int[] values = new int[n];

        values [0] = 1;
        values [1] = 1;

        int temp ;

        for (int i = 2 ; i < n ; i++) {

            values [i] = values[i-1] +  values[i-2];

        }

         return values[n-1];

    }


}