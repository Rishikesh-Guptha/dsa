package dsa;

import java.util.Scanner;

public class basics1 {
    public static void main(String[] args){
        // Data type
        byte this_is_byte= 126;
        short this_is_short= 32767;
        int this_is_int=2147483646;
        long this_is_long= 9223372036854775806l; // add l at the end of long variable or else it will be considered as integer

        float this_is_float= 3.1234567f; //add f at the end of float variable or else it will be considered as double
        double this_is_double=3.12345678901234567;

        boolean bool =true;

        char character= 'a'; //single quotes for char
        char ascii_values = 65;
        System.out.println(ascii_values);

        //Non primitive data types

        String this_is_string = "This is also called as a Special data type";

        //Scanner is used to get inputs from the user
        Scanner scanner =new Scanner(System.in);
        int b= scanner.nextInt();

        // use sout shortcut to print in the console
        System.out.println("hello world" + b);

        // Type Casting

        //widening casting : byte -> short -> char -> int -> long -> float -> double : smaller to larger (Automatically)

        int small = 10;
        float bigger =small;
        System.out.println(bigger);

        //Narrowing casting : double -> float -> long -> int -> char -> short -> byte : larger to smaller (manually)

        float big = 11.993f;
        int smal = (int)big;
        System.out.println(smal);

        //Conditions
        //if-else

        int z=10;
        int x=20;
        int y=30;

        if (z>x){
            System.out.println(z+ "is greater than"+x);
        } else if (y>x) {
            System.out.println(y+ "is greater than"+x);

        } else{
            System.out.println(x+ "is greater than"+z);
        };

        //short hand for loop

        String answer = (x>y)? "x is greater":"y is greater";
        System.out.println(answer);

        //switch
         int day =8;
         switch (day) {
             case 1:
                 System.out.println("its 1");
                 break;
             case 2:
                 System.out.println("its 2");
                 break;
             case 3:
                 System.out.println("its 3");
                 break;
             case 4:
                 System.out.println("its 4");
                 break;
             case 5:
                 System.out.println("its 5");
                 break;
             case 6:
                 System.out.println("its 6");
                 break;
             case 7:
                 System.out.println("its 7");
                 break;
             default:
                 System.out.println("its none");

         };

         //while loop

        int num =5;
        while(num<10){
            System.out.println("it is less than 10");
            num++;
        }

        //do while loop

        do {
            System.out.println("executed once irrespective of the result");
        }while(num>10);

        //for loop

        for (int i = 0; i < 5; i++) {
            System.out.println("for loop is running");
        };

        String[] cars= {"audi","benz","ferrari","rolls royce"};
        for(String i:cars){
            System.out.println(i);
        }

        //Functions
        sum();
        int sum2_total =sum2();
        System.out.println("The sum of the 2nd sum function is"+sum2_total);

    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.1:");
        int a = sc.nextInt();
        System.out.println("Enter no.2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum is:" + sum);
    }
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.1:");
        int a = sc.nextInt();
        System.out.println("Enter no.2:");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }


}
