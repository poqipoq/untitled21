package com.company;


import com.sun.org.apache.bcel.internal.generic.I2F;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] mass = {-40,60, 10, 40, 30, 50, 80, 70};
        for (int i = 0; i < mass.length ; i++) {
            for (int j = 0; j < mass.length ; j++) {
                if(mass[i]<mass[j]){
                    int tmp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = tmp;
                }


            }
            System.out.println(Arrays.toString(mass));
        }
    }

}



