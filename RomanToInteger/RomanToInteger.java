/*  Author: noamme
 *  Date: January 26, 2015
 *  Source: https://oj.leetcode.com/problems/roman-to-integer/
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 */


import java.util.*;

public class RomanToInteger {


    public static void main(String[] args){
        
        System.out.println(romanToInt("XIV")); //sample input
    }

    /*  
     * Converts Roman Numeral to Integer
     */


    public static int romanToInt(String s) {
        int length = s.length();
        String[] array = s.split("(?!^)");
        int counter = 0;

        //map showing value of each roman numeral
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);

        for (int i = 0; i < length; i++){

            int first = map.get(array[i]);

            if(i < length - 1){
                int second = map.get(array[i+1]); 
            
            
                if(Double.compare(first, second) >= 0) {
                    counter = counter + first;
                }
                //this determines if roman numeral goes before or after existing numeral
                else{
                    if(second - first < 10){
                        counter = counter - 1;
                    }
                    else if((second - first < 100) && ((second - first) > 10)){
                        counter = counter - 10;
                    }
                    else if((second - first > 100)){
                        counter = counter - 100;
                    }
                }

            
            } else {
                counter = counter + first;
            }

        }

        return counter;

    }   

}

