import java.util.ArrayList; 

public class BasicJava{

    //Print 1-255
    public void firstAlgo() {
        int i = 1;
        while (i<=5) {
            System.out.println(i++);
        }
    }

    //Print odd numbers between 1-255
    public void oddNums() {
        int i = 1;
        while (i<=10) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    //Print Sum
    public void sumSoFar() {
        int sum = 0;
        int i = 0;
        while (i<=5) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
            i++;
        }
    }

    //Iterating through an array
    public void iterateArray(int[] arr) {
        int i = 0;
        while (i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
    }

    //Find Max
    public void findMax(int[] arr) {
        int maxNum = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
    }

    //Get Average
    public void average(int[] arr) {
        int total = 0;
        int count = 0;
        for (int i=0; i<arr.length; i++){
            total += arr[i];
            count++;
        }
        Integer avg = total/count;
        System.out.println(avg);
    }

    //Array with Odd Numbers
    public void oddArray() {
        int i = 0;
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        while (i<=15){
            if (i % 2 == 1){
                myArray.add(i);
            }
            i++;
        }
        System.out.println(myArray);
    }

    //Greater Than Y
    public void greaterThan(int[] arr, int y) {
        int counter = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > y){
                counter++;
            }
        }
        System.out.println(counter);
    }

    //Square the values
    public static int[] squareValues(int[] arr1) {
        for (int i=0; i<arr1.length; i++){
            int squared = arr1[i]*arr1[i];
            arr1[i] = squared;
        }
        return arr1;
    }

    //Eliminate Negative Numbers
    public static int[] eliminateNegatives(int[] arr1) {
        for (int i=0; i<arr1.length; i++){
            if (arr1[i] < 0) {
                arr1[i] = 0;
            }
        }
        return arr1;
    }

    //Max, Min and Average
    public static int[] maxMinAverage(int[] arr1) {
        int min = arr1[0];
        int max = arr1[0];
        int total = 0;
        int count = 0;
        for (int i=0; i<arr1.length; i++){
            if (arr1[i] > max) {
                max = arr1[i];
            } 
            if (arr1[i] < min) {
                min = arr1[i];
            }
            total += arr1[i];
            count++;
        }
        int average = total/count;
        int[] newArray = {max, min, average};
        return newArray;
    } 

    //Shifting the Values in the Array
    public static int[] shiftValues(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }

}
