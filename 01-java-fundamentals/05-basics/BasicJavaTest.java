import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    
    public static void main (final String args[]) {
        BasicJava num = new BasicJava();
        num.firstAlgo();
        num.oddNums();
        num.sumSoFar();
        int[] arr = { 2, 10, 3, 7 };
        num.iterateArray(arr);
        num.findMax(arr);
        num.average(arr);
        num.oddArray();
        int y = 3;
        num.greaterThan(arr, y);
        int[] arr1 = { 1, 5, 10, -2 };
        System.out.println(Arrays.toString(num.eliminateNegatives(arr1)));
        System.out.println(Arrays.toString(num.squareValues(arr1)));
        System.out.println(Arrays.toString(num.maxMinAverage(arr1)));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(num.shiftValues(arr)));  
    }
}