/*  Author: noamme
 *  Date: April 20, 2015
 *  Source: https://oj.leetcode.com/problems/reverse-integer/
 *
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * 
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 *
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 *
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 *
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 * 
 */


public class ReverseInteger {
    
	public static void main(String[] args){

		System.out.println(reverse(10)); //sample input

	}

    public static int reverse(int x) {

        int sign = 1;
        int digitlength = 0;
        long finalnum = 0;
        
        
        if (x < 0){
            x = x * -1;
            sign = -1;
        }

    	int num = x;
    	while(num > 0){
            num = num / 10;
            digitlength++;
        }
        

        while (digitlength > 0){

            finalnum = finalnum + ((x % 10L) * (int)Math.pow(10, digitlength - 1));
            x = x / 10;
            digitlength --;

        }

        if (finalnum >= Integer.MAX_VALUE || finalnum <= Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int) (finalnum * sign);
        }


        
    }
}