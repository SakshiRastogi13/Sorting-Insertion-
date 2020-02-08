import java.util.Arrays;
import java.util.Scanner;

public class Inserion_Using_Recursion {

	static void Recursive_Insertion_Sort(int arr[], int n) 
    { 
        if (n <= 1) 
            return; 
      
        Recursive_Insertion_Sort( arr, n-1 ); 
       
        
        int last = arr[n-1]; 
        int j = n-2; 
       
       
        while (j >= 0 && arr[j] > last) 
        { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
    } 
      
    
    public static void main(String[] args) 
    { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the length of the array:-");
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	System.out.println("Enter the elements of an array:-");
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    	}
       
        Recursive_Insertion_Sort(arr, arr.length); 
          
        System.out.println("Sorted Array is:-");
        System.out.println(Arrays.toString(arr)); 
    } 
} 

