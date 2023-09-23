package dsa;

import java.util.Arrays;

// Constructors notes
public class basic2 {
    public static void main(String[] args) {
        String str[]={"ball","dog","cat","apple"};
        int str1[]={3,0,1};
        String extra=null;
        for (int i = 0; i <str.length ; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].compareTo(str[i])>0){
                    extra=str[i];
                    str[i]=str[j];
                    str[j]=extra;
                }
            }

        }
        System.out.println(Arrays.toString(str));
        System.out.println(str[0].compareTo(str[3]));
        String a="hello";
        int z=10;
        System.out.println(a.indexOf('l',4));
        System.out.println(Arrays.asList(str1).contains(3));

    }
}



