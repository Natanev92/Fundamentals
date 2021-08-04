import java.util.Arrays;
import java.util.ArrayList;
public class TestPuzzling {
    
    public static void main(String[] args) {
        
        Puzzling puzzle = new Puzzling();
        
        System.out.println(Arrays.toString(puzzle.getTenRolls()));
        System.out.println(puzzle.getRandomLetter());
        System.out.println(puzzle.generatePassword());
        System.out.println(Arrays.toString(puzzle.getNewPasswordSet(5)));
        int[] testShuffle1 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(puzzle.shuffleArray(testShuffle1)));
    }
}
