package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Number> array = new ArrayList<>();
        int counter = 0;
        int iterations = 100;

	    for (int n = 0; n < iterations; n++)
        {
            ArrayList<Number> nums = new ArrayList<>();
            for (int j = 1; j <= 100; j++)
                nums.add(new Integer(j));
            counter = 0;
            while (nums.size() != 0)
            {
                counter++;
                int num = (int) ((Math.random() + 0.01) * 100);
                for (int m = 0; m < nums.size(); m++)
                {
                    if (nums[m] == num)
                        nums.remove(m);
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
