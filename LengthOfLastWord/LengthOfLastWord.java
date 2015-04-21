
/*  Author: noamme
 *  Date: April 22, 2015
 *  Source: https://oj.leetcode.com/problems/length-of-last-word/
 *
 *  Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 *  If the last word does not exist, return 0.
 *
 *  Note: A word is defined as a character sequence consists of non-space characters only.
 *
 *  For example, 
 *  Given s = "Hello World",
 *  return 5.
 * 
 */


public class LengthOfLastWord {
    
	public static void main(String[] args){

		System.out.println(lengthOfLastWord("Hello World")); //sample input

	}

    public static int lengthOfLastWord(String s) {
    	
    	String[] array = s.split(" ");

    	if (array.length == 0){
    		return 0;
    	}
    	else {
    		return array[array.length - 1].length();
    	}


        
    }
}