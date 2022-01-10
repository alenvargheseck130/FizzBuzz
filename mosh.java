import java.text.NumberFormat;
import java.util.Scanner;

import javax.naming.InitialContext;

public class mosh {
    public static void main(String[] args){
        //if divisible by multiples of 5 - fizz
        //if divisible by multiples of 3 - buzz
        //if divisible by multiples of 5 and 3 - fizzbuzz
        //if divisible not divisible by either 5 or 3 - return back the same number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int user_input = scanner.nextInt();
        int multiple_of_five = user_input % 5;
        int multiple_of_three = user_input % 3;
        if(multiple_of_five ==0 && multiple_of_three == 0){
            System.out.println("FizzBuzz");
        }
        else if(multiple_of_three == 0){
            System.out.println("Buzz");
        }    
        else if(multiple_of_five == 0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(user_input);
        }
        }
}