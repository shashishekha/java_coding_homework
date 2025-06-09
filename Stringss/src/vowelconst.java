//count vowels and consonants

import java.util.Scanner;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string : ");
    String temp = sc.nextLine();
    for(int i=0; i< temp.length(); i++){
        char ch = temp.charAt(i);
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch =='u'){
            System.out.println("The letter "+ch+" is vowel.");
        }
        else
        System.out.println("The letter "+ch+" is consonant.");

    }
}
