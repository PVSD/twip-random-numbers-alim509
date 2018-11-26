package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int array[] = new int[100];
        int counter = 0;
        boolean complete = false;

	    while (Arrays.binarySearch(array, 0) >= 0)
        {
            int num = (int)((Math.random() + 0.01) * 100);
            array[num - 1]++;
            counter++;
            complete = true;
            for (int i = 0; i < 100; i ++)
            {
                if (array[i] == 0)
                {
                    complete = false;
                }
            }
            if (complete)
            {
                break;
            }
        }

        for (int i = 0; i < 100; i ++)
        {
            System.out.println(array[i]);
        }

        System.out.println("Program ran " + counter + " times.");

    }
}
