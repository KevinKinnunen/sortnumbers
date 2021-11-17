import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter how much numbers you want to store(MAX 8): ");  
        n=sc.nextInt();  
        int[] myArr = new int[8];  
        System.out.println("Enter the numbers you want to sort: ");  
        for(int i=0; i<n; i++)  
        {  
        myArr[i]=sc.nextInt();  
        }  
        System.out.println("Result of numbers being sorted: ");
        sc.close();
        
        int[] unsorted = myArr;
        int[] so = Sorter.sort(unsorted);
        for(int s : so){
            System.out.println(s + ", ");
        }
    }
}
