package practice;

import java.util.Scanner;

public class camelcase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=s.toCharArray();
        for (int i = 0; i <a.length; i++) 
        {
            if(Character.isUpperCase(a[i]))
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
