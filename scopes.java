package dsa;

public class scopes {
    //This variable has scope all over the class.
    static int shadowing_variable= 123;
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a:"+a);
        {
            //Block scope
            a=20; // a is already initialized outside , so modifiying it inside a block does change it
            int c=100; // c is initialized only inside the block , so not available outside the block
            System.out.println("c:"+c);
        }
        System.out.println("a is:"+a);
        System.out.println("c is:"+"This statement give me error");
        change_value(a);
        System.out.println("a is after function:"+a); // The value of a is not changing even after changed in the function

        //Shadowing
        //The shadowing_variable has a scope in the whole class , but if we initialize it inside a block again , then that new value is only taken
        //This shadowing of the new or lower scope on the higher scope is called shadowing

        System.out.println("shadowing variable before initialization is: "+shadowing_variable);
        int shadowing_variable=100;
        System.out.println("shadowing variable after initialization is: "+shadowing_variable);

    }
    static void change_value(int a) {
        a = 100;
        System.out.println("number:" + a);
    }


}
