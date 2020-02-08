import java.util.Scanner;

public class Insertion_Without_Recursion {
	void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
   
   

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Insertion_Without_Recursion IS1=new Insertion_Without_Recursion();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array:-");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the elements of an array:-");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	IS1.sort(a);
	IS1.printArray(a);
	
    } 
}
