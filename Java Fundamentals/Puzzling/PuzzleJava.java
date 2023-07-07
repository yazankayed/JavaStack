import java.util.Random;
import java.util.ArrayList;


public class PuzzleJava {

public ArrayList<Integer> getTenRolls() {
// To use methods from the Random library you will need to create an instance of Random
// From there you can use any of the methods listed in the documentation. For example:
ArrayList<Integer> myArray = new ArrayList<Integer>();
for (int i =0; i<10;i++){
Random randMachine = new Random();
int y=randMachine.nextInt(20);
myArray.add(y);
}
System.out.println(myArray);
return myArray;
}


public char getRandomLetter(){
    char[] LowerCaseAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

Random randMachine = new Random();
int y=randMachine.nextInt(25);
return LowerCaseAlphabet[y];

}

    public String generatePassword(){
        String password = "";
        for (int i = 0 ; i < 8; i++){
            password += getRandomLetter();
        }
        return password ;
    }
    public ArrayList<String> getNewPasswordSet(int x ){
        ArrayList<String> setPassword = new ArrayList<String>();
        for (int i = 1 ; i <= x; i++){
            setPassword.add(generatePassword());
        }
        return setPassword;
}




}