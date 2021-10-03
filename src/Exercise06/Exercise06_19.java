package Exercise06;
/*6.19:(Sorted?) Write the following method that returns true if the list is already sorted
in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether the
list is sorted or not. Here is a sample run. Note that the first number in the input
indicates the number of the elements in the list.*/
//@author:Maharshi Kevadiya(20cs026)
//@Email:20cs026@charusat.edu.in

import java.util.Scanner;
public class Exercise06_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take Size of Array From User
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int [] list = new int[size];
        System.out.print("Enter list : ");
        //Take Array Element From User
        for (int i = 0; i < list.length; i++)
        {
            list[i]=sc.nextInt();
        }
        //call isSort() Method and Display Result
        if(isSort(list)){
            System.out.println("The list is already sorted");
        }
        else{
            System.out.println("The list is not sorted");
        }
    }
    //Declare isSort() Method
    public static boolean isSort(int []list ){
        int x = 0;
        //Run for Loop for Each elements of Array
        for (int i = 0; i < list.length-1; i++) {
            //Check i index is greater than i+1 index or not(till length of Array)
            if(list[i]>list[i+1]){
                x=1;
                break;
            }
            else{
                x=0;
            }
        }

        if(x==0){
            return true;
        }
        else{
            return false;
        }
    }
}