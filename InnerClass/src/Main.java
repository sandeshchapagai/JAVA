class Outerclass{
    int x=5;
    class InnerClass{
        int x=10;
    }
}
public class Main {
    public static void main(String[] args) {
        Outerclass myobj1= new Outerclass();
        System.out.println(myobj1.x);
        Outerclass.InnerClass my = myobj1.new InnerClass();
        System.out.println(my.x);
    }
}