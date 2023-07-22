package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void  main(String[] args){

        //Arrays are Linear static ds where datas are stored in continous memory locations

        //Initialization or Creation

        int[] array1 ={1,2,3,4,5};
        int[] array2= new int[5]; //Now the size of the array is 5 , so no more extra elements can be added

        //Printing

        System.out.println(array1); //This prints the address of the array
        System.out.println(array1[0]);
        System.out.println(Arrays.toString(array1)); //This prints the array as a string

        //Dynamic array or Lists
        //These are basicaly non static arrays where we can add or delete elements as we wish

        //Initialization or Creation

        List<Integer> dynamic_array = new ArrayList<>();

        dynamic_array.add(1);
        dynamic_array.add(2);
        System.out.println(dynamic_array); //This prints the values of the dynamic array



    }
}
