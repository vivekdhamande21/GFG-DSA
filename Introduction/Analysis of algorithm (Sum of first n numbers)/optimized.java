/*Given a number n, write a function to find sum of first n natural numbers*/

import java.util.*;
class optimized{
    static int sumOfn(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println(sumOfn(n));
    }
}