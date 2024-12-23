import java.util.*;

public class methodsec {

    public static String checkEvenOdd(int number){
        if(number % 2 == 0){
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static int factorial(int number){
        int result= 1;
        for (int i = 1 ; i <= number ; i++ ){
            result *= i;
        }
        return result;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Please Enter a number :");
        int number = sc.nextInt();

        System.out.println("number is : " + checkEvenOdd(number));

        System.out.println("factorial  of "+ number + " is : " + factorial(number));



    }
    
}
