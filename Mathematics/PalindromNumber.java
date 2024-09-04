/* Palindrom Number */

import java.util.*;
class PalindromNumber{
    static boolean palindromNumber(int n){
        int temp = n;
        int num=0;
        while(n>0){
            num = num*10 + n%10;
            n=n/10;
        }
        if(temp == num)
            return true;
        else
            return false;
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println(palindromNumber(n));
        sc.close();
    }
}