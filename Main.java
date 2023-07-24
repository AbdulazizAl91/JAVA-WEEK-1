import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//   1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
       /*
        System.out.println("Enter the first number");
        int first_number = input.nextInt();
        System.out.println("Enter the second number");
        int second_number = input.nextInt();
        int addition_numbers = first_number + second_number;
        int subtraction_numbers = first_number - second_number;
        int multiplication_numbers = first_number * second_number;
        int division_numbers = first_number / second_number;
        int mood_numbers = first_number % second_number;

        System.out.println(first_number + " + " + second_number +" = "+ addition_numbers);
        System.out.println(first_number + " - " + second_number +" = "+ subtraction_numbers);
        System.out.println(first_number + " x " + second_number +" = "+ multiplication_numbers);
        System.out.println(first_number + " / " + second_number +" = "+ division_numbers);
        System.out.println(first_number + " mood " + second_number +" = "+ mood_numbers);*/


//   2.Write a Java program to convert a given string into lowercase.


        /*System.out.println("enter your text");
        String text = input.nextLine();
        String text2 = text.toLowerCase();
        System.out.println(text2);*/

//   3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.

        /*System.out.println("enter text");
        String text = input.nextLine();
        System.out.println("enter number of index to print char from your text");
        int index_number= input.nextByte();
        if (index_number <= text.length()-1){
            System.out.println(text.charAt(index_number));
        }
        else{
            System.out.println("your input out of range");
        }*/

//   4.Write a Java program to accept a number and check the number is even or not.
//   Prints 1 if the number is even or 0 if the number is odd. (use if-statement)

        /*System.out.println("enter number");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }*/

//   5.Write a program that checks the role of the user
        /*System.out.println("enter your user role");
        String role = input.nextLine();
        if (role.equalsIgnoreCase("admin")){
            System.out.println("welcome admin");
        }
        else if (role.equalsIgnoreCase("superuser" )){
            System.out.println("welcome superuser");
        }
        else {
            System.out.println("welcome user");
        }*/

//   6.Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

        /*System.out.println("enter first number");
        int first_number = input.nextInt();
        System.out.println("enter second number");
        int second_number = input.nextInt();
        System.out.println("enter third number");
        int third_number = input.nextInt();
        int sum_of_first_number_and_second_number = first_number + second_number;

        if(sum_of_first_number_and_second_number == third_number){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }*/

//   7.Take three numbers from the user and print the greatest number.

        /*System.out.println("enter first number");
        int first_number = input.nextInt();
        System.out.println("enter second number");
        int second_number = input.nextInt();
        System.out.println("enter third number");
        int third_number = input.nextInt();

        if(first_number > second_number && first_number > third_number){
            System.out.println(first_number);
        }
        else if (second_number > first_number && second_number >third_number){
            System.out.println(second_number);
        }
        else if (third_number > first_number && third_number > second_number){
            System.out.println(third_number);
        }
        else {
            System.out.println("all numbers are equal");
        }*/

//   8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7
//   and displays the name of the weekday.

        /*System.out.println("enter a number to find out what it equals in days");
        int number_of_day = input.nextInt();

        switch (number_of_day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("your number is out of range of week ");
        }*/


    }
}