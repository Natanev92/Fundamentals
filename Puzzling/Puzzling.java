import java.util.Random;
import java.util.ArrayList;

public class Puzzling {
    Random randMachine = new Random();

    public int[] getTenRolls() {
        int[] rolls = new int[10];

        for (int i=0; i<rolls.length; i++) {
            rolls[i] = randMachine.nextInt(21);
        }

        return rolls;
    }

    public char getRandomLetter() {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char randomLetter = alphabet[randMachine.nextInt(26)];
        return randomLetter;
    }

    public String generatePassword() {
        String password = "";
        for (int i=0; i<8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet(int length) {
        String[] set = new String[length];

        for (int i=0; i<length; i++) {
            set[i] = generatePassword();
        }
        return set;
    }

    public int[] shuffleArray (int[] arr) {
        int bound = arr.length; // Get the array length
        for (int i=0; i<bound; i++) {
            int swapIndex = randMachine.nextInt(bound);
            int temp = arr[i]; // Copy the value at the current index
            arr[i] = arr[swapIndex]; // Swap the value at current index with different value
            arr[swapIndex] = temp; // Replace the value at the random index with the previous value of the current index
        }
        return arr;
    }
}