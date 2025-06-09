
import java.util.Scanner;
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String ReDup = new String(sc.nextLine());
    String Ans = new String();

    for(int i=0; i<ReDup.length(); i++){
        for(int j=0; j<ReDup.length(); j++){
            if(ReDup.charAt(i)!=ReDup.charAt(j)){
                Ans = Ans+ReDup.charAt(i);
            }
        }
    }
    System.out.println(Ans);


}
