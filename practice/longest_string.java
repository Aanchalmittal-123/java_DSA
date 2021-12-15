package practice;

import java.util.Scanner;

public class longest_string 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        String a[]=new String[n];
        for (int i = 0; i <=n; i++)
        {
            a[i]=sc.nextLine();
        }
        int max=0;
        String sb="";
        for (int i = 0; i <a.length; i++) {
            if(max<a[i].length())
            {
                max=a[i].length();
                sb=a[i];
            }
        }
        System.out.println(sb);
    }
}
