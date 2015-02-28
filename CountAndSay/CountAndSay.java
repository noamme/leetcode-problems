public class CountAndSay {

    /*
     * Test comment
     *
     */ 

    public static void main(String[] args){
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        String number = "" + 1;
        StringBuffer finalanswer = new StringBuffer(); 

        if (n < 1){
            return null;
        }
        
        while((n - 1) > 0){
            for(int i = 0; i < number.length(); i++){

                if ( i > 0 && number.charAt(i) == number.charAt(i-1)){
                    continue;
                }

                else{
                char digit = number.charAt(i);
                int counter = 0;
                    for(int j = i; j < number.length(); j++){
                        char compared = number.charAt(j);
                        if (digit == compared){
                            counter++;
                        }
                        else {
                            break;
                        }
                    }

                finalanswer.append(counter);
                finalanswer.append(digit);

                }
            }

            n--;
            number = finalanswer.toString();
            finalanswer.delete(0, finalanswer.length());
        }
        

        
        return number;

        
    }
}