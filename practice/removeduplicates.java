package practice;

import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        StringBuffer s=new StringBuffer(s1);
        for (int i = 0; i <s.length()-1; i++) {
            int flag=0;
            for (int j = i-1; j>0; j--) {
                if(s.charAt(i)==s.charAt(j)){
                    flag=1;
                }
            }
            if(flag==0){
                for (int j = i+1; j < s.length(); j++) {
                    if(s.charAt(i)==s.charAt(j)){
                        s.delete(j,j+1);
                        j--;
                    }
                }
            }
        }
        System.out.println(s);
    }
}
