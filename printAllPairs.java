import java.util.Scanner;
import java.util.Arrays;

class printAllPairs 
{

//10. ans: 

	public static void findDuplicates(int n, int arr[]){

	

		Arrays.sort(arr);
		int dupp[]= new int[n];
		int j=0;
		for(int i=1; i<n; i++){
			if(arr[i]==arr[i-1]){
				dupp[j] = arr[i];
				j++;
			}
		}

		for(int i=0; i<j; i++){
			System.out.print(dupp[i] +" ");
	}
	}

//9. ans : 

/*	public static void rotateArrayLeft(int n, int arr[], int k){
		
		// Example: arr = [10, 20, 30, 40] ? Output = [20, 30, 40, 10]
		int rotatedArray= new int[];
		for(int =0; i<n; i++){
			rotatedArray[i] = arr[n-k];

	}

	*/




	public static void frequency(int n, int arr[]){
			Arrays.sort(arr);
			int count =1;
			for(int i=0; i<n; i++ ){
				if ((i+1)<n)
				{
				if(arr[i]==arr[i+1]){
					count+=1;
				}
				else{ 
					System.out.println(arr[i] +","+count);
					count =0;
					}
				}

	}
	}






	public static int secondLargestElement(int n, int arr[]){
		Arrays.sort(arr);
		int m = arr[n-2];
		return m;
}

	public static int checkPalindrome(int n, int arr[]){
		int flag =1;
		for (int i=0;i<n/2 ;i++ )
		{
			if(arr[i]==arr[n-i-1]){
				flag=1;
			    System.out.println("arr[i]"+arr[i]);
				System.out.println("arr[n-i-1]"+arr[n-i-1]);
		}
		else flag=0;
	}
	System.out.println("flag" +flag);
	return flag;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");

		int n = sc.nextInt();
		System.out.println("Enter the number of times the array to be left rotated: ");
		int k = sc.nextInt();
		int arr [] = new int[n];
		int Printarr []=new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			}

//5. Print All pairs solution

		for(int i=0; i<n;i++){
			for(int j=i+1; j<n; j++){
				System.out.println("Pairs"+arr[i]+","+arr[j]);
		
	}

//6. Print second largest element.

}		

		// int ele = secondLargestElement(n,arr);

		// System.out.println("Second Largest Element is: "+ ele);

		// //int m = checkPalindrome(n,arr);
		// System.out.println(m);
		// if(m==0)System.out.println("NO");
		// else System.out.println("YES");
		frequency(n,arr);
		//System.out.println();
		//findDuplicates(n,arr);
		//rotateArrayLeft(n,arr,k);


	}
}
