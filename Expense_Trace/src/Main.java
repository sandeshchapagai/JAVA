
class Number{
    private int  number;
    public int add(int x,int y){
        return x*y+number;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int newNumber){
        this.number=newNumber;
    }
}
class Hello extends Number{
//    public int j=cap.add(4,5);
protected   int  integerNumber = 7;
}
public class Main {
    public static int add(int x, int y){
          return  x+y;
    }
    public static void main(String[] a ) {

        Hello cap = new Hello();
        cap.setNumber(8);
        int m = cap.add(7,6);
        System.out.println(m+cap.integerNumber);





    }

    }
