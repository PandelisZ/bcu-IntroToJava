/*
 * Copyright (c) 2017. Pandelis Zembashis - S15101590
 * For Advanced Programming UG, Birmingham City University
 */

package algorithms;

public class test {
    private static boolean testLinearSearch(){
        int[] list = new int[]{1, 7, 8, 3, 5, 9};
        int result = Algorithm.linearSearch(list, 5);
        int nullRes = Algorithm.linearSearch(list, 20);

        return result == 4 && nullRes == -1;
    }

    private static boolean testLinearSearchMax(){
        int[] list = new int[]{1, 7, 8, 3, 5, 9};
        int[] empty = new int[]{};
        int result = Algorithm.linearSearchMax(list);


        if (result == 9) try {
            Algorithm.linearSearchMax(empty);
        } catch (Exception e) {
            return true;
        }
        return false;

    }

    private static boolean testBinarySearch(){
        int[] list = new int[]{1, 5, 8, 20, 30, 90};
        int result = Algorithm.binarySearch(list, 5);
        int nullRes = Algorithm.binarySearch(list, 99);

        return result == 1 && nullRes == -1;
    }

    private static void printTestRes(String searchName, boolean pass){
        if (pass) {
            System.out.println(searchName + " test PASSED \uD83D\uDC4D ");
        }
        else {
            System.out.println(searchName +  " test FAILED \uD83D\uDEAB ");
        }
    }

    public static void main(){


        test.printTestRes("Linear Search", test.testLinearSearch() );
        test.printTestRes("Maximum Element Linear Search", test.testLinearSearchMax() );
        test.printTestRes("Binary Search", test.testBinarySearch() );

    }
}
