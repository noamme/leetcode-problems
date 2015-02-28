import java.util.*;

public class RomanToInteger {


    public static void main(String[] args){
        
        System.out.println(romanToInt("XIV"));
    }

    public static int romanToInt(String s) {
        int length = s.length();
        String[] array = s.split("(?!^)");
        int counter = 0;

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




         





        







//M = 1000, D = 500, C = 100, L = 50, X = 10,  I = 1
