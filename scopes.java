package dsa;

public class scopes {
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

    }
    static void change_value(int a){
        a=100;
        System.out.println("number:"+a);
    };


}
