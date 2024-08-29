/*Given a number n, write a function to find sum of first n natural numbers*/

import java.util.*;
class sumOfFirstN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        if(n==0)
            System.out.println(0);
        int sum=0;
        while(n>0){
            sum = sum + n;
            n--;
        }
        System.out.println(sum);
        sc.close();
    }
}