public class CountAndSay {

/*  Author: noamme
 *  Date: February 18, 2015
 *  Source: https://oj.leetcode.com/problems/count-and-say/
 *
 *
 *  The count-and-say sequence is the sequence of integers beginning as follows:
 *
 *     1, 11, 21, 1211, 111221, ...
 *
 *  1 is read off as "one 1" or 11.
 *  11 is read off as "two 1s" or 21.
 *  21 is read off as "one 2, then one 1" or 1211.
 *  Given an integer n, generate the nth sequence.
 *
 *  Note: The sequence of integers will be represented as a string.
 */

    public static void main(String[] args){

        System.out.println(countAndSay(6)); //sample input
    }


    /*  
     * Takes integer n and generates the nth element in the sequence
     */

    public static String countAndSay(int n) {

        String number = "" + 1; //starts with first element of sequence
        StringBuffer finalanswer = new StringBuffer(); 

        if (n < 1){ //checks to see that n is bigger than 0
            return null;
        }
        
         
        while ((n - 1) > 0){ 
            //given the nth element, find element n+1.
            for (int i = 0; i < number.length(); i++){

                if (i > 0 && number.charAt(i) == number.charAt(i-1)){
                    continue;
                }

                else{
                char digit = number.charAt(i);
                int counter = 0;
                    for (int j = i; j < number.length(); j++){
                        char compared = number.charAt(j);
                        if (digit == compared){
                            counter++; //counts how many times the same digit appears together
                        }
                        else {
                            break;
                        }
                    }

                finalanswer.append(counter);
                finalanswer.append(digit);

                }
            }
            //this allows the next element to be found
            //when the while loop gets to 0, the nth element for integer n is found
            n--; 
            number = finalanswer.toString();
            finalanswer.delete(0, finalanswer.length());
        }
         
        return number;

    }
}