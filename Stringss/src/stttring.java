//Reverse String

import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string to be reversed: ");
    String name = sc.nextLine();
    System.out.println(name);
    for(int i=name.length()-1; i>=0; i--){
        char ch = name.charAt(i);
        System.out.print(ch);
    }
}
