/*  Author: noamme
 *  Date: February 9. 2015
 *  Source: https://oj.leetcode.com/problems/rotate-array/
 *
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */


public class RotateArray {
    
 	public static void main(String[] args){

 		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7}; //sample input

 		rotate(nums, 3);


    }

    public static void rotate(int[] nums, int k) {

    	int[] temp = new int[nums.length];
    	int j = 0;
    	k = k % nums.length;


    	for (int i = 0; i < nums.length; i++){
    		if ((i+k) < nums.length){
    			temp[i + k] = nums[i];
    		}
    		else{
    				temp[0 + j] = nums[i];
    				j++; 
    		}

    	}
    	
    	for (int i = 0; i < temp.length; i++){
    	    nums[i] = temp[i];
    	}


        
    }
}