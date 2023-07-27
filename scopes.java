package dsa;

public class scopes {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a:"+a);
        {
            //Block scope
            a=20;
            int c=100;
            System.out.println("c:"+c);
        }
        System.out.println("a is:"+a);
        System.out.println("c is:"+"This statement give me error");
    }
}
