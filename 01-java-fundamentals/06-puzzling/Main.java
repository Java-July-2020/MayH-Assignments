import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main (final String args[]) {
        PuzzleJava puzzle = new PuzzleJava();
        int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        puzzle.printSum(arr);
        System.out.println(puzzle.returnOver10(arr));
        List<String> nameArr = Arrays.asList("Nancy", "Jinichi", "Fujabayashi", "Momochi", "Ishikawa");
        Collections.shuffle(nameArr);
        System.out.println(nameArr);
        char[] alphabetArr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> charList = new ArrayList<Character> ();
        
        for (char ch: alphabetArr) {
            charList.add(ch);
        }

        puzzle.alphabetSoup(charList);




        // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.


        
        //Collections.shuffle(alphabetArr);
        //puzzle.alphabetSoup(alphabetArr);
    }
}