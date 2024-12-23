import java.util.Scanner;


public class starting {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of rectangle :");
      int x = sc.nextInt();

      System.out.println("Enter the width of rectangle :");
      int y = sc.nextInt();

      int area = x * y;
      System.out.println("The area of rectangle is :" + area);
    }
  }