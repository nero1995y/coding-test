package com.simso.baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2475 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int sum = 0;
        
        for (int i = 0; i < 5; i++) {
            
            int result = Integer.parseInt(st.nextToken());
            
            sum += result * result;
        }

        System.out.println(sum % 10);


    }

}
