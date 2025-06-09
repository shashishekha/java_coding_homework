import java.util.Scanner;
import java.util.Arrays;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ana = sc.nextLine();
    String toana = sc.nextLine();
    char tempArray[] = ana.toCharArray();
    char tempArray1[]= toana.toCharArray();

    Arrays.sort(tempArray);
    Arrays.sort(tempArray1);


    System.out.println();
    System.out.println();

    if(Arrays.equals(tempArray1,tempArray)) System.out.println("isAnagram.");
    else System.out.println("isNotanagram");

}
