package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);

        //Arrays are Linear static data structures which contains or allows only data's of same data type
        //The object is actually created in HEAP memory.
        //It is said to continous memory location, but in the java main docs there is noe proof that it is being allocated continously .
        //It is up to the JVM to decide ,whether to be continous or not.
        //When elements are created .i.e., Initialozed and declared etc.., they are created in the heap memory.
        //Heap is the runtime memory area, where the memory for all classes, objects etc.. are allocated.



        //So arrays are created in heap.
        //Heap objects are not necessarly continous.


        //Initialization or Creation

        int[] array1 ={1,2,3,4,5};
        int[] array2= new int[5]; //Now the size of the array is 5 , so no more extra elements can be added

        //Printing

        System.out.println(array1); //This prints the address of the array
        System.out.println(array1[0]);
        System.out.println(Arrays.toString(array1)); //This prints the array as a string

        //Multi dimensional array

        int[][] multi_array={{1,2,3},{4,5,6}};
        System.out.println(multi_array); //address of the multi dimensional array

        //Dynamic array or Lists
        //These are basicaly non static arrays where we can add or delete elements as we wish

        //Initialization or Creation

        List<Integer> dynamic_array = new ArrayList<>();

        dynamic_array.add(1);
        dynamic_array.add(2);
        System.out.println(dynamic_array); //This prints the values of the dynamic array

        ArrayList<Integer> list = new ArrayList<>(5);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);

    }

}
