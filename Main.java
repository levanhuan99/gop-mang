package com.codewithme;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array1={1,2,3,4,5};
        int[] array2={6,7,8,9,10};
        int[] array3=new int[array1.length+array2.length];

        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }

        int index=0;
        for (int j=array1.length;j<array3.length;j++){
            array3[j]=array2[index];
            index++;
        }
        System.out.println(Arrays.toString(array3));


    }

}
