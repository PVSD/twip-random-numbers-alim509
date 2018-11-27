package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int array[] = new int[10000];
        int counter = 0;
        int iterations = 100;

	    for (int n = 0; n < iterations; n++)
        {
            int num = (int)((Math.random() + 0.01) * 100);
            array[n] = num;
            counter++;
        }

        for (int i = 0; i < 100; i ++)
        {
            System.out.println(array[i]);
        }

        System.out.println("Program ran " + counter + " times.");

    }
}
