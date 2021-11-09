import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
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
        System.out.println("Result of numbers being sorted: ");  
        // accessing array elements using the for loop  
        for (int i = 0; i < array.length; i++)   
        {  
        for (int j = i + 1; j < array.length; j++)   
        {  
        int tmp = 0;  
        if (array[i] > array[j])   
        {  
        tmp = array[i];  
        array[i] = array[j];  
        array[j] = tmp;  
        }  
        }  
        //prints the sorted element of the array  
        System.out.println(array[i]);  
        }  
    }  
}  
