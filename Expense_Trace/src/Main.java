
class Number{
    public int add(int x,int y){
        return x*y;
    }
}
public class Main {
    public static int add(int x, int y){
          return  x+y;
    }
    public static void main(String[] a ) {
        System.out.println("hello world");
          int y=add(8,6);
        System.out.println(y);
        Number hello = new Number();
        int z = hello.add(3,2);
        System.out.println(z);


    }

    }
