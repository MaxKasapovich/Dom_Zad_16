package com.company;

public class StackOverFlowTest {
    static int count = 0;

    public static void test(){
        count++;
        System.out.println(count);
        test();
    }

    public static void main(String[] args) {
        try {
            test();
        }catch (StackOverflowError e){
            System.out.println("Not good...");
        }
    }
}
