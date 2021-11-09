import java.util.Arrays;
import java.util.Scanner;

public class TestApp2 {
    public static void main(String[] args) {

        // initializing unsorted int array
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter how much numbers you want to store: ");  
        //reading the number of elements from the that we want to enter  
        n=sc.nextInt();  
        //creates an array in the memory of length 10  
        int[] array = new int[10];  
        System.out.println("Enter the numbers you want to sort: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        array[i]=sc.nextInt();  
        } 
        // let us print all the elements available in list
        for (int number : array) {
            System.out.println("Number = " + number);
        }

        // sorting array
        Arrays.sort(array);

        // let us print all the elements available in list
        System.out.println("The sorted int array is:");
        for (int number : array) {
            System.out.println("Number = " + number);
        }
    }
}