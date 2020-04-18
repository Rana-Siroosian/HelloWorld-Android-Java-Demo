package com.example.learnjava;

public class Comparisons {
    public static void main(String[] args) {
        int value = 4;
        for (int i=0; i<8; i++){
            if(i == value){
                System.out.println(i + " is equal to " + value);
            }
            if(i <= value){
                System.out.println(i + " is less than or equal " + value);
            }
            if(i >= value){
                System.out.println(i + " is greater than or equal to " + value);
            }
        }
        System.out.println( 4 != value);
        System.out.println(5 != value);

        String greeting = "Hello Rana";
        String greeting2 = "Hello";
        greeting2 = greeting2 + " Rana";
        System.out.println(greeting);
        System.out.println(greeting2);
//        System.out.println(greeting == greeting2); -> gives us false but with equals gives us true which is the right one
        System.out.println(greeting.equals(greeting2));
    }
}
