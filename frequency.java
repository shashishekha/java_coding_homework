
import java.util.* ;

class frequency 
{	

	public static void frequency(int n, int arr[]){
			Arrays.sort(arr);
			int count =1;
			for(int i=1; i<n; i++ ){
				{
				if(arr[i]==arr[i-1]){
					count+=1;
				}
				else{ 
					System.out.println(arr[i] +","+count);
					count =0;
					}
				}

	}
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
