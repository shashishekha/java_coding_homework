import java.util.Scanner;

class RotateArray1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();

	}

	int k = arr[0];
	for(int i=0; i<n; i++){
		if(i+1<n){
		arr[i] = arr[i+1];}
}

arr[n-1] = k;

for(int ele: arr){
	System.out.print(ele + " ");
}
	}
}