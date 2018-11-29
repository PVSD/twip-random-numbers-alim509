package com.company;

public class Main {

    public static void main(String[] args) {

        int array[] = new int[100];
        int counter = 0;
        int iterations = 100;
        System.out.println(array.length);

	    for (int n = 0; n < iterations; n++)
        {
            for (int j = 0; j < 100; j++)
            {
                array[j] = j + 1;
            }
            counter = 0;
            while (array.length != 0)
            {
                counter++;
                int num = (int) ((Math.random() + 0.01) * 100);
                for (int m = 0; m < array.length; m++)
                {
                    if (array[m] == num)
                    {
                        array[m] = 0;
                    }
                }

            }
        }

        for (int i = 0; i < 100; i ++)
        {
            System.out.println(array[i]);
        }

        System.out.println("Program ran " + counter + " times.");

    }
}
