/* package codechef; // don't place package name! */

import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int num=sc.nextInt();
            int count=0;
            while (num!=0) {
                if (num % 10 == 4)
                    count++;
                num /= 10;
            }
            System.out.println(count);
        }
    }
}
