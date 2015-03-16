/*  Author: noamme
 *  Date: March 3, 2015
 *  Source: https://oj.leetcode.com/problems/majority-element/
 *
 *  Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 *  For example,
 *    "A man, a plan, a canal: Panama" is a palindrome.
 *    "race a car" is not a palindrome.
 *
 *  Note:
 *  Have you consider that the string might be empty? This is a good question to ask during an interview.
 *
 *  For the purpose of this problem, we define empty string as valid palindrome.
 * 
 */


import java.util.Arrays;

public class ValidPalindrome {
    
    public static void main(String[] args){
       System.out.println(isPalindrome("A man, a plan, a canal: Panama")); //sample input
    }

    /*  
     * Takes a string and determines whether it is a palindrome
     */

    public static boolean isPalindrome(String s) {
        String[] array = s.split("(?!^)"); //this gets rid of punctuation
        int length = array.length;
        int i = 0;
        int j = length - 1;

        while(i < length - 1){
            if(array[i].matches("[A-Za-z0-9]+") == false){ //makes sure input is alphanumeric in order to skip spaces
                i++;
                continue;               
            }
            if(array[j].matches("[A-Za-z0-9]+") == false){
                j--;
                continue;
            }
            if(array[i].equalsIgnoreCase(array[j])){ //compares first and last letters sequentially
                i++;
                j--;
                continue;
            }
            else{
                return false;
            }

        }

        return true;
        
    }

}