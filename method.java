import java.util.*;

public class method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String sentence = sc.nextLine(); 

        System.out.println("In Upper case : " + sentence.toUpperCase() );
        System.out.println("In Lower case : " + sentence.toLowerCase() );
        System.out.println("length is : " + sentence.length() );
        

        int count = 0;
        for(int i =0 ; i < sentence.length() ; i++){
            if (sentence.charAt(i)=='A'|| sentence.charAt(i) =='a' ){ 
                //to point index use charAt
            
            count = count+1;
            }
        }
        
        System.out.println("No of a in the sentence : " + count );


    }
    
}
