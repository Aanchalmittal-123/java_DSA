package practice;
import java.util.Scanner;
public class concatreverse {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.concat(s2);
        System.out.println(s1);
        StringBuffer sb = new StringBuffer(s1);
        for (int i = 0; i < (sb.length())/2; i++) {
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1,temp);
        }
        System.out.println(sb);
    }
}
