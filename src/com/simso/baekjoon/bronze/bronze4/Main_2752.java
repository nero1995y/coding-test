package com.simso.baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2752 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] array = new int[3];

        for (int i = 0; i <array.length ; i++) {

            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        for (int number :array) {
            System.out.println(number);
        }


    }
}
