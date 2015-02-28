import java.util.Arrays;

public class ValidPalindrome {
    
    public static void main(String[] args){
       System.out.println(isPalindrome("a cat taca"));
    }


    public static boolean isPalindrome(String s) {
        String[] array = s.split("(?!^)");
        int length = array.length;
        int i = 0;
        int j = length - 1;

        while(i < length - 1){
            if(array[i].matches("[A-Za-z0-9]+") == false){
                i++;
                continue;               
            }
            if(array[j].matches("[A-Za-z0-9]+") == false){
                j--;
                continue;
            }
            if(array[i].equalsIgnoreCase(array[j])){
                i++;
                j--;
                continue;
            }
            else{
                return false;
            }

        }

        return true;
        
    }

}