package ict;

import java.util.Scanner;

class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of customers");
        int n=sc.nextInt();
        System.out.println("enter number of customers who's bill is perfect square");
        int num=sc.nextInt();
        System.out.println("enter the bills");
        int[] bills=new int[num];
        for(int i=0;i<num;i++)
        {
            bills[i]=sc.nextInt();
            if(Math.sqrt(bills[i])-Math.floor(bills[i])==0){
                System.out.println(bills[i]);
            }
        }
        
    }
}