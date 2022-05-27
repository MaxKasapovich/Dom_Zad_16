package com.company;

public class ArrayExceptionTest {

    public static void main(String[] args) {

        int[] array = {101,102,103,104,105,106};
        printArray(array, 1, 7);
        System.out.println();
        printArray(array, -1, 8);
        System.out.println();
        printArray(array, 7, 9);
    }

    public static void printArray(int[] array, int start, int end){
        int k = 0;
        try {
            for (int i = start; i <= end; i++) {
                k = i;
                System.out.print(array[i] + " ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\nError. An attempt to access a non-existent index: current index: " + k + "\nArray size: " + array.length);
        }
    }
}
