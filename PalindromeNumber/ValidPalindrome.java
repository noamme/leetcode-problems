/*  Author: noamme
 *  Date: February 8, 2015
 *  Source: https://oj.leetcode.com/problems/palindrome-number/
 *
 *  Determine whether an integer is a palindrome. Do this without extra space.
 * 
 */


import java.util.Arrays;

public class ValidPalindrome {
    
    public static void main(String[] args){
       System.out.println(isPalindrome(1849999481)); //sample input
    }

    /*  
     * Takes an integer and determines whether it is a palindrome
     */

    public static boolean isPalindrome(int x){
        int counter = 0;
        int num = x;
        int first = 0;
        int last = 0;

        if (x < 0){
            return false; //checks to see number is not negative
        }

        //establishes counter size
        while(num > 0){
            num = num / 10;
            counter++;
        }

        //compares first and last numbers sequentially 
        while(counter > 1){
            first = (x / (int)Math.pow(10,counter - 1));
            last = x % 10;


            x = x - (first * (int)Math.pow(10, counter - 1)); 
            x = x / 10;


            if (first != last){
                return false;
            }

            counter-=2;

        }

        
        return true;


    }
}