package singleton;

import java.util.Scanner;

public  class Main {
    static  float kiloGram(float x){
        return x/1000;
    }
    static  float gram(float x){
        return x*1000;
    }
  public  static  void main(String[] args){
      Scanner a =new Scanner(System.in);
      System.out.println("Choose the for conversion of :\n Kg:k \n Gram=g");
      String expression= a.next();
      switch (expression){
          case "k":
              Scanner g = new Scanner(System.in);
              System.out.println("Enter the value");
              float str= Float.parseFloat(g.next());
              float gram = kiloGram(str);
              System.out.println("The value in gram is :"+gram+"g");
              break;
          case "g":
              Scanner kg = new Scanner(System.in);
              System.out.println("Enter the value");
              double str1= Float.parseFloat(kg.next());
              double kilogram = gram((float) str1);
              System.out.println("The value in kilogram is :"+kilogram+"kg");
              break;

      }

  }
}