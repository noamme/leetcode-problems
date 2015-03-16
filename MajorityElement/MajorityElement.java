/*  Author: noamme
 *  Date: February 8, 2015
 *  Source: https://oj.leetcode.com/problems/valid-palindrome/
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 */



import java.util.Arrays;

public class MajorityElement {

 	public static void main(String[] args){

 		int[] test = new int[] {1, 2, 2, 3};

 		System.out.println(majorityElement(test));

    }

    public static int majorityElement(int[] num) {

    	int length = num.length;
    	int median = length / 2;
    	Arrays.sort(num);

    	if (length < 2){
    		return num[0];
    	}
    	else {
    		if (num[median] == num[median - 1]){
    			return num[median - 1];
    		}
    		else {
    			return num[median];
    		}
    	}


    	
    	
    

    }

}
