package march15Codes;

import java.util.Arrays;

public class StringOperations_Updated_Test {

        public static void main(String[] args) {
            StringOperations_Updated myStr = new StringOperations_Updated("java is super fun for us");
            System.out.println(myStr.returnCapitalized());
            System.out.println(Arrays.toString(myStr.returnString()));
            System.out.println(Arrays.toString(myStr.returnSentenceArray()));
        }
    }


