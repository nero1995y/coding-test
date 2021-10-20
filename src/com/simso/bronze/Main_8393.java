package com.simso.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main_8393 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = sum(Integer.parseInt(br.readLine()));

        System.out.println(result);
    }

    public static int sum(int input) {

        if (input == 1) {

            return 1;
        }

        return input + sum(input - 1);
    }

}
