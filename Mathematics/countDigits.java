/*Finding numbers of digits in a number*/

import java.util.*;
class countDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}