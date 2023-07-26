import java.util.Scanner;

public class MainAssignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1.Write a Java program to test if the first and the last element of an array of integers are same.
//                The length of the array must be greater than or equal to 2

        /*int [] array = {50, -20, 0, 30, 40, 60, 10};
        boolean isEqual = true;
        int outer_number=0;
        int inner_number=0;
        for (int outer = 0 ; outer<1;outer++){
            outer_number=array[outer];
            for (int inner =1;inner<array.length;inner++){
                inner_number = array[inner];


            }
        }
        if (outer_number!= inner_number){
            isEqual=false;
            System.out.println(isEqual);

        }
        else {
            System.out.println(isEqual);
        }

         */

//        2.Write a Java program to find the k largest elements in a given array.
//        Elements in the array can be in any order.

        /*int [] array = {1, 4, 17, 7, 25, 3, 100};
        int temp =0;
        for(int outer =0; outer<array.length;outer++){
            for (int inner=outer;inner<array.length;inner++){
                if (array[outer]<array[inner]){
                    temp=array[outer];
                    array[outer]= array[inner];
                    array[inner]=temp;
                }
            }
        }
        for (int i =0 ; i<3 ; i++){
            System.out.printf("%d,",array[i]);
        }

         */

//        3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
       /* int [] array = {1, 4, 17, 7, 25, 3, 100};
        int average = 0;
        int average_counter=0;
        int test_counter=0;
        for (int item:array){
            average= average+ item;
            average_counter++;
        }
        average = average/average_counter;
        for (int item:array){
            if (item>average){
                test_counter++;
            }
        }
        ArrayList<Integer> arrayList= new ArrayList<>();
        for (int i=0;i<test_counter;i++){
            for (int o=i;o<array.length; o++){

                if (array[o]>average){
                    arrayList.add(array[o]);

                }

            }
            break;
        }
        System.out.println("The average of the said array is: "+ average+
                " The numbers in the said array that are greater than the average are:"+ arrayList);

        */

//        4.Write a Java program to get the larger value between first and last element of an array of integers.
        /*int[] array={20, 30, 40};
        int temp =0;
        for(int outer =0; outer<array.length;outer++){
            for (int inner=outer;inner<array.length;inner++){
                if (array[outer]<array[inner]){
                    temp=array[outer];
                    array[outer]= array[inner];
                    array[inner]=temp;
                }
            }
        }
        System.out.println("Larger value between first and last element:" + array[0]);

         */

//        5.Write a Java program to swap the first and last elements of an array and create a new array.

        /*int[] array={20, 30, 40};
        int [] array1=new int[3];
        int count=0;
        for(int i=array.length-1;i>=0;i--){
            array1[count]=array[i];
            count++;

        }
        System.out.print("New array after swapping the first and last elements:");
        for (int item:array1){
            System.out.print(item+" ");
        }

         */

//        6.Write a Java program to find all of the longest word in a given dictionary.

       /* String [] text = { "cat", "dog", "red", "is", "am" };
        int length_number = 0;

        for (String item:text){
            if(item.length()>length_number){
                length_number=item.length();
            }

        }
        System.out.println(length_number);
        for (String item :text){
            if (item.length() == length_number){
                System.out.printf("%s ",item);
            }
        }

        */

//        7.Write a menu driven Java program with following option

       /* int  choose_number;
        System.out.println("enter array size");
        int array_size = input.nextInt();
        int element_numbers=array_size;
        int [] array = new int[array_size];
        int count=0;
        int element_of_array;
        int element_to_search;
        boolean isfound =true;

        do {
            System.out.println("enter\n 1.Accept elements of an array\n" +
                    "\n" +
                    "2.Display elements of an array\n" +
                    "\n" +
                    "3.Search the element within array\n" +
                    "\n" +
                    "4.Sort the array\n" +
                    "\n" +
                    "5.To Stop ");
            choose_number=input.nextInt();
            if (choose_number==1){
                System.out.println("you can entre "+element_numbers + " element to array");
                if(element_numbers==0){
                    System.out.println("you can not add more element to array");
                    continue;
                }
                else {

                    for (int i = count; i <= count; i++) {

                        System.out.println("enter element to add to array");
                        array[count] = element_of_array = input.nextInt();
                        System.out.println("your element is in the array ");
                        count++;
                        break;
                    }
                    element_numbers--;
                }

            }
            else if(choose_number==2){
                System.out.print("the elements of array is: ");
                for (int item:array){
                    System.out.print(item+" ");
                }
            }
            else if(choose_number==3){
                System.out.println("enter the element to serch in the array");
                element_to_search=input.nextInt();
                for(int outer =0; outer<array.length;outer++){
                    for (int inner=outer;inner<array.length;inner++){
                        if(array[inner]==element_to_search){
                            isfound = true;
                            break;
                        }
                        else {
                            isfound=false;
                        }
                    }
                    if (isfound==true){
                        System.out.println(element_to_search+ " is in the array");
                        break;
                    }
                    else {
                        System.out.println(element_to_search+ " is not in the array");
                        break;
                    }
                }

            }
            else if(choose_number==4){
                int temp =0;
                for(int outer =0; outer<array.length;outer++){
                    for (int inner=outer;inner<array.length;inner++){
                        if (array[outer]>array[inner]){
                            temp=array[outer];
                            array[outer]= array[inner];
                            array[inner]=temp;
                        }
                    }
                }
                System.out.println("array is sorted");


            }
            else if(choose_number <1||choose_number>5){
                System.out.println("you can not add less than 1 or more than 5");
            }
            System.out.println("\nnext enter");


        }while (choose_number!=5);
        System.out.println("the program is end");

        */

//        8. Write a program thats displays the number of occurrences of an element in the array.
        /*int [] array={1,1,1,3,3,5};
        System.out.println("the elements of array is 1,1,1,3,3,5 enter number to cheek how many time is repeated");
        int number_to_cheek= input.nextInt();
        int count =0;
        boolean is_repeated = true;
        for(int outer =0; outer<array.length;outer++){
            if(array[outer]==number_to_cheek){
                count++;
            }
        }
        System.out.println(number_to_cheek+" occurs "+count+" times");

         */

//        9. Write a program that places the odd elements of an array before the even elements.
        /*int[]array={2,3,40,1,5,9,4,10,7};
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i =0;i<array.length;i++){
            if(array[i] % 2!=0){
                arrayList.add(array[i]);
            }
            else {
                continue;
            }
        }
        for(int i =0;i<array.length;i++){
            if(array[i] % 2==0){
                arrayList.add(array[i]);
            }
            else {
                continue;
            }
        }
        System.out.println(arrayList);

         */

//        10. Write a program that test the equality of two arrays.
           /* int[] array={2,3,6,6,4};
            int[] array1={2,3,6,6,4};
            boolean is_equal=true;
        for(int outer =0; outer<array.length;outer++){
            is_equal=true;
            for (int inner=outer;inner<array1.length;inner++){
                if (array[outer]==array1[inner]){
                    is_equal=true;
                    break;

                }
                else {
                    is_equal=false;
                    break;
                }
            }
        }
        System.out.println(is_equal);

            */

    }
}