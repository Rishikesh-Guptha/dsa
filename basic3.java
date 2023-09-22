package dsa;

import java.util.Locale;

public class basic3  extends hello {
    public static void main(String[] args) {
//        hello obj=new hello();
//        System.out.println(obj.str);
//        System.out.println(obj.z);
//        obj.meth();
        String a="hello";
        String b=a.toUpperCase()+"guys";
        System.out.println(a.length());
        System.out.println(b.equals(a));


    }

}
class hello implements inter{
    @Override
            public void meth(){
        System.out.println("Implemented from inter in hello class");
    }
    int a=10;
    String str="This is hello";

}
interface inter{
    int x=10;
    String z="Hello";
    void meth();

}

