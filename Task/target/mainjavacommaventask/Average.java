package com.maven.task;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = io.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = io.nextInt();
        }

        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}