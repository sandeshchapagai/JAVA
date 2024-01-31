import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        System.out.println("Enter the subjects mark");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of 1st subject: "
        );
        int a= sc.nextInt();
        System.out.println("Enter the Marks of 2nd subject: ");
        int b= sc.nextInt();
        System.out.println("Enter the Marks of 3rd subject: ");
        int c= sc.nextInt();
        System.out.println("Enter the Marks of 4th subject: ");
        int d= sc.nextInt();
        System.out.println("Enter the Marks of 5th subject: ");
        int e= sc.nextInt();
        float p=(a+b+c+d+e);
        float q=p/500;
        float r=q*100;
        System.out.println("The result is:");
        System.out.println(r);
    }}
