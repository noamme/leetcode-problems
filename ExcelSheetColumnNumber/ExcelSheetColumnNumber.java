/*  Author: noamme
 *  Date: February 28, 2015
 *  Source: https://oj.leetcode.com/problems/excel-sheet-column-number/
 *
 *
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 *  For example:
 *
 *    A -> 1
 *    B -> 2
 *    C -> 3
 *    ...
 *    Z -> 26
 *    AA -> 27
 *    AB -> 28 
 */

public class ExcelSheetColumnNumber {

    public static void main(String[] args){

        System.out.println(titleToNumber("AB")); //Sample input

    }

    /*  
     * Takes a column title and converts it to the corresponding integer
     */

    public static int titleToNumber(String s) {

        int length = s.length();
        char[] array = s.toCharArray();
        int number;
        int currentnumber;
        int total = 0;
        
        //loops through each letter and calculates the integer
        for (int i = 0; i < length; i++){
            number = (int) array[i];
            currentnumber = (number - 64);
            total = (total * 26) + currentnumber;

        }

        return total;

    }


}