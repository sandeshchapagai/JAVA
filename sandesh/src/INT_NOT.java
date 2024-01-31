import java.util.Scanner;

public class INT_NOT {
    public static void main(String[] args) {
        System.out.println("check the int or not");
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        System.out.println("********************************");
        System.out.println("check the float or not");
        System.out.println("Enter the Number");
        Scanner sp = new Scanner(System.in);
        System.out.println(sp.hasNextFloat());
    }
}
