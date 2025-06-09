import java.util.Scanner;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String Palindrome = sc.nextLine();
    String checkPalindrome="";
    for(int i=Palindrome.length()-1; i>=0;i--){
        char ch = Palindrome.charAt(i);
        checkPalindrome += ch;
    }
    System.out.println(Palindrome);
    System.out.println(checkPalindrome);
    if(Palindrome.equals(checkPalindrome)){
        System.out.println("isPalindrome");
    }
    else System.out.println("isNotPalindrome");
}
