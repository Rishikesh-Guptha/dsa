package dsa;
// Constructors notes
public class basic2 {
    int length;
    int breadth;
    basic2() {
        length=0;
        breadth=0;
    }
    basic2(int a){
        length=breadth=a;
    }
    basic2(int a, int b){
        length=a;
        breadth=b;
    }
    int area(){
        return length*breadth;
    }
}

 class one{
     public static void main(String[] args) {
         basic2 obj=new basic2();
         basic2 obj1=new basic2(5);
         basic2 obj2=new basic2(5,10);
         int a =obj.area();
         int b =obj1.area();
         int c =obj2.area();
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
     }

}
