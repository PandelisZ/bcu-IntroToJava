/*
 * Copyright (c) 2017. Pandelis Zembashis - S15101590
 * For Advanced Programming UG, Birmingham City University
 */

package algorithms;

public class Algorithm {


    //lit int causes issues
    public static int linearSearch(int[] L, int x){
        for(int i = 0; i <= L.length - 1; i++){
            if( L[i] == x ) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchMax(int[] L){
        if (L.length == 0){
            new Error("Array is empty");
        }
        int h = L[0];
        for(int i = 1; i <= L.length -1; i++){
            if (L[i] > h){
                h = L[i];
            }
        }
        return h;
    }

    public static int binarySearch(int[] L, int x){

        int a,b;
        a = 0;
        b = L.length-1;

        while(a <= b){
            int m = (a + b) / 2;
            if (x == L[m] ){
                return m;
            }
            else if (x < L[m]){
                b = m - 1;
            }
            else {
                a = m + 1;
            }
        }

        return -1;

    }

    public static int[] selectionSort(int[] L){
        for(int i = 0; i <= L.length - 2; i++){
            int a = i;
            for(int j = i + 1; j <= L.length - 1; i++ ){
                if ( L[j] < L[a] ){
                    a = j;
                }
            }
            L[a] = L[i];
        }
        return L;
    }




}
