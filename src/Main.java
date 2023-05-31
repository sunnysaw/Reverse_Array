/*
Question : Given an array, the task is to reverse the array
_________________________________________________________________
I/O = {1,2,3}
O/P = {3,2,1}
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,SizeOfArray,Input;
        System.out.println("Enter the size of array :");
        SizeOfArray = input.nextInt();
        int[] array = new int[SizeOfArray];
        System.out.println("Enter the digit to fill the size of array :");
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the reverse value of array :");
        for (start = array.length - 1; start >= 0; start--){
            System.out.print(" " + array[start] );
        }
    }
}