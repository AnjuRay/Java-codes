import java.util.Scanner;

public class square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //area of square
        System.out.println("Enter value of each side :");
        int side = sc.nextInt();

        int area = side * side;
        System.out.println("The Area of square is : " + area);

    }
}
