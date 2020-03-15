package march15Codes;

import java.util.Arrays;

public class DimArray_test {
    public static void main(String[] args) {
        DimArray obj1= new DimArray();
        int [] array1=obj1.returnArray();
        System.out.println(Arrays.toString(array1));
        obj1.printOddIndexes(array1);
        obj1.printEvenIndexes(array1);
    }
}
