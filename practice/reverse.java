package practice;
import java.util.Scanner;
public class reverse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < (sb.length())/2; i++) {
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1,temp);
        }
        System.out.println(sb);
    }    
}
