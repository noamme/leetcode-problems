/*
 * test comment
 */

public class ExcelSheetColumnTitle {

    public static void main(String[] args){

        System.out.println(convertToTitle(711));

    }


    public static String convertToTitle(int n){

        StringBuffer string = new StringBuffer();

        while (n > 0){

            string.insert(0, (char)('A' + ((n - 1) % 26)));
            n = ((n - 1) / 26);

        }

        return (string.toString());

    }

}