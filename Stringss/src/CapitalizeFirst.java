import java.util.Scanner;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String capitalizeFirst= sc.nextLine();
    String First = capitalizeFirst.substring(0,1).toUpperCase();
    String next = capitalizeFirst.substring(1);
    String Result = First+next;
    System.out.println(Result);
}