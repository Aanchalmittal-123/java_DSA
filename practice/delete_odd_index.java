package practice;
import java.util.Scanner;
public class delete_odd_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer("");
        for (int i = 0; i <s.length(); i++) {
            if(i%2!=0){
                //donothing
            }
            else{
                sb.append(s.charAt(i));
            }
            
        }
        System.out.println(sb);
    }
}
