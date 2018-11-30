package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List iterationCount = new ArrayList<>();
        int counter;
        int iterations = 100;
        double average = 0;
        int array[] = new int[100000];

        while (iterations <= 10000) {
            for (int n = 0; n < iterations; n++) {
                List<Integer> numsArray = new ArrayList<>();

                for (int j = 1; j <= 100; j++) {
                    numsArray.add(j);
                }
                counter = 0;

                while (numsArray.size() != 0) {
                    counter++;
                    int num = (int) ((Math.random() + 0.01) * 100);

                    for (int m = 0; m < numsArray.size(); m++) {
                        if (numsArray.get(m) == num) {
                            numsArray.remove(m);
                        }
                    }
                }

                iterationCount.add(counter);
            }

            for (int i = 0; i < iterationCount.size(); i++) {

                array[i] = (int) iterationCount.get(i);
                average += array[i];
            }
            average /= iterationCount.size();
            System.out.println(iterations + " Runs:   " + average);
            iterations *= 10;
        }
    }
}
/*package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Average for 100 Runs : " + Run(100));
        System.out.println("Average for 1000 Runs : " + Run(1000));
        System.out.println("Average for 10000 Runs : " + Run(10000));
    }
    private static double Run(int iteration)
    {
        List<Integer> counts = new ArrayList<>();
        for(int i=0; i<iteration;i++)
        {
            List<Integer> checklist = new ArrayList<>();
            for(int j = 1;j<=100;j++)
                checklist.add(j);
            int counter = 0;
            while(checklist.size() != 0)
            {
                counter++;
                int random = ((int)(100 * Math.random()))+1;
                for(int j = 0; j<checklist.size();j++)
                {
                    if (checklist.get(j) == random)
                        checklist.remove(j);
                }
            }
            counts.add(counter);
        }
        double average = 0;
        System.out.println(counts.size());
        System.out.println(counts.get(1));
        for(int i = 0; i <counts.size();i++)
        {
            average += counts.get(i);
        }
        //average /= counts.size();
        return average;
    }
}*/
