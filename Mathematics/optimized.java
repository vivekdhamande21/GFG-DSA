/*Finding numbers of digits in a number*/

/*Recursive Programming */

import java.util.*;
class optimized{
    static int countDigit(int n){
        if(n==0)
            return 0;
        return 1 + countDigit(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println(countDigit(n));
        sc.close();
    }
}