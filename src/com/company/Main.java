package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter number");
        int zd = keyboard.nextInt();

        for (int x=10; x>=1; x--){
            System.out.println(x);
        }

    }
}
