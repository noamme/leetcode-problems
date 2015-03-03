/*  Author: noamme
 *  Date: February 2, 2015
 *  Source: https://oj.leetcode.com/problems/valid-parentheses/
 *
 *  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *  The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 */


import java.util.*;

public class ValidParentheses {
    
    public static void main(String[] args){
        
        System.out.println(isValid("{()}")); //sample input

    }

    /*  
     * Determines whether string of brackets and parentheses is valid
     */


    public static boolean isValid(String s) {
        String[] array = s.split("(?!^)");
        int length = array.length;
        Stack<String> stack = new Stack<String>();

        if (array[0].equals(")") || array[0].equals("]") || array[0].equals("}")){
            return false; //if string starts with closing brackets, automatically false
        }

        //use a stack to keep track of open brackets
        for (int i = 0; i < length; i ++){

            if ((array[i].equals("(") || array[i].equals("[") || array[i].equals("{"))){
                stack.push(array[i]);        
            }

            if (stack.size() < 1){
                return false;
            }

            if ((array[i].equals(")") || array[i].equals("]") || array[i].equals("}"))){
              String lastpopped = new String(stack.pop());

                if(lastpopped.equals("(") && array[i].equals(")")){
                    continue;
                }
                else if(lastpopped.equals("[") && array[i].equals("]")){
                    continue;
                }
                else if(lastpopped.equals("{") && array[i].equals("}")){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
          

        if (stack.empty()){
            return true;
        }
        else{
            return false; 
        }
      
    }

}
