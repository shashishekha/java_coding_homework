
import java.util.Scanner;
class maximumElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();}
		
		int k=-1;
		for(int i=0; i<n; i++){
			if(arr[i]>k){
				k=arr[i];
			}
		
	}

	System.out.println("The maximum Element is: " + k);

}
}
