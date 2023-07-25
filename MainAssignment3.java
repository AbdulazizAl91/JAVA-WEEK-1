import java.util.Scanner;

public class MainAssignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//    1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that number.
//
//        If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//
//        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

        /*for (int i =1; i<=100;i++){
            if (i % 3==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 ==0){
                System.out.println("Fizz");
            }
            else if (i % 5 ==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

         */

//  2.Write a Java program to reverse a string.

        /*System.out.println("enter text");
        String text = input.nextLine();
        for (int i = text.length()-1; i>=0;i--){
            System.out.print(text.charAt(i));
        }*/


//   3.Write a program that prompts the user to input a positive integer. It should then print the multiplication
//        table of that number.

        /*System.out.println("enter positive number to print the multiplication table of that number.");
        int number = input.nextInt();
        for(int i =1; i<=10;i++){
            if (number > 0){
                System.out.println(number + " x "+  i + " = "+ number * i );
            }
            else if (number==0){
                System.out.println(" all numbers multiplication by 0 the answer is 0");
                break;
            }
            else {
                System.out.println("your number is negative");
                break;
            }
        }

         */

//   4.Write a program to find the factorial value of any number entered through the keyboard.

        /*System.out.println("enter number to print the factorial of the number");
        int number = input.nextInt();
        int factorial = 1;
        int i = number;
       while ( i >= 1){
           factorial *=i ;
           i--;

       }
        System.out.println(factorial);

         */

//   5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to
//   the power of another.

        /*System.out.println("enter two numbers second number will be the pow of first number ");

        int first_number = input.nextInt();
        int second_number = input.nextInt();
        int total=1;


        for (int i = second_number;i>=1;i--){
                total= total* first_number;



        }
        System.out.println(total);

         */

//   6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        /*int number ;
        int odd_numbers =0;
        int even_numbers = 0;


        do {
            System.out.println("enter even and odd numbers or 0 to print The sum of odd numbers and " +
                    "the sum of even numbers");
            number=input.nextInt();
            if (number % 2 ==0){
                even_numbers = even_numbers + number;
            }
            else {
                odd_numbers = odd_numbers + number;
            }


        }while (number !=0);
        System.out.println("the total of odd numbers = " + odd_numbers);
        System.out.println("the total of even numbers = " + even_numbers);

         */

//   7.Write a program that prompts the user to input a positive integer. It should then output a message indicating
//   whether the number is a prime number.

        /*System.out.println("enter number to cheek if it prime or not");
        int number = input.nextInt();
        ;
        boolean is_prime = true;

        for (int i = number; i <= number; i++) {

            for (int j = 2; j < i / 2; j++) {
                if (number % j == 0) {
                    System.out.println("your number is not prime");
                    is_prime = false;
                    break;
                }

            }
            if (is_prime) {
                System.out.println("your number is prime");
                break;
            }
        }
        
         */


//   8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
//   negative and zeros entered.

       /* int number;
        int positive_number=0;
        int negative_number=0;
        do {
            System.out.println("enter positive and negative numbers or 0 to end and print the total of positive " +
                    "numbers and negative numbers");
            number = input.nextInt();
            if (number > 0) {
                positive_number = positive_number + number;
            } else {
                negative_number = negative_number + number;
            }
        }while (number != 0);
        System.out.println(positive_number);
        System.out.println(negative_number);

        */

//   9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days
//   (Days 1 -7) for each week.

        /* for (int i =1; i<=4;i++){
            System.out.println("Week "+i);
            for(int j =1;j<=7;j++){
                System.out.println("Day "+j);
            }
        }

         */

//   10.Write a program thats check if the word is a palindrome or not.


        /* System.out.println("enter text");
        String text = input.nextLine();
        String palindrome_text = "";
        char a ='\0';
        for (int i = text.length()-1; i>=0;i--){
             a = text.charAt(i);

            palindrome_text = palindrome_text + a;

        }
        if (text.equalsIgnoreCase(palindrome_text) ) {
            System.out.println(text + " is palindrome to " + palindrome_text);
        }
        else {
            System.out.println(text + " is not palindrome to " + palindrome_text);
        }

         */


    }
}