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
    }
}
