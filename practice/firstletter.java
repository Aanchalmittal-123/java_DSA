package practice;
import java.util.Scanner;
public class firstletter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(s.charAt(0));
        for (int i = 1; i <s.length(); i++) {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                System.out.print(s.charAt(i+1));
            }
        }
        
    }
}
