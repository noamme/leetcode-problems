import java.util.*;

public class ValidParentheses {
    
    public static void main(String[] args){
        
        System.out.println(isValid("{()}"));

    }

    public static boolean isValid(String s) {
        String[] array = s.split("(?!^)");
        int length = array.length;
        Stack<String> stack = new Stack<String>();

        if (array[0].equals(")") || array[0].equals("]") || array[0].equals("}")){
            return false;
        }

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
