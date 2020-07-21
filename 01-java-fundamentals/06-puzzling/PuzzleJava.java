import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    
    //Print Sum of Array
    public static void printSum(final int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    // Return an array that includes numbers that are greater than 10
    public static ArrayList<Integer> returnOver10(final int[] arr) {
        final ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }

    // Shuffle the alphabet array and after shuffling, display the first and last letters of the array.
    // If the first letter of the array is a vowel, display a message. 
    public static void alphabetSoup(ArrayList<Character> alphabetArr) {
        Collections.shuffle(alphabetArr);
        System.out.println("Last Letter: " + alphabetArr.get(alphabetArr.size()-1));
        char first = alphabetArr.get(0);
        System.out.println("First Letter: " + first);
        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
        System.out.println("The first letter is a vowel!");
        }
    }
}
