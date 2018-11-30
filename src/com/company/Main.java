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