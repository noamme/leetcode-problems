/*  Author: noamme
 *  Date: February 15, 2015
 *  Source: https://oj.leetcode.com/problems/excel-sheet-column-title/
 *
 *
 *  Given a positive integer, return its corresponding column title as appear in an Excel sheet.
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

public class ExcelSheetColumnTitle {

    public static void main(String[] args){

        System.out.println(convertToTitle(711)); //sample input

    }


    /*  
     * Takes an integer and converts to corresponding column title
     */

    public static String convertToTitle(int n){

        StringBuffer string = new StringBuffer();

        while (n > 0){

            string.insert(0, (char)('A' + ((n - 1) % 26))); //convert integer to letter
            n = ((n - 1) / 26);

        }

        return (string.toString());

    }

}