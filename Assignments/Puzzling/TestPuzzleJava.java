import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
public static void main(String[] args) {
PuzzleJava generator = new PuzzleJava();

ArrayList<Integer> myArray = generator.getTenRolls();

System.out.println(myArray);
System.out.println(generator.getRandomLetter());
System.out.println(generator.generatePassword());
System.out.print(generator.getNewPasswordSet(100));
//..
// Write your other test cases here.
//..
}
}