import java.util.ArrayList;
import java.util.Arrays;
public class TestBasic {
    
    public static void main (String[] args) {
        Basics basics = new Basics();

        basics.rangePrint();
        basics.printOdds();
        System.out.println(basics.sumNums(255));
        int[] testArr = {1,3,5,7,9,11,13};
        basics.printArr(testArr);
        ArrayList<Integer> newTestArr = new ArrayList<Integer>();
        newTestArr.add(1);
        newTestArr.add(6);
        newTestArr.add(4);
        newTestArr.add(22);
        newTestArr.add(15);
        newTestArr.add(3);
        basics.findMax(newTestArr);
        ArrayList<Integer> newTestArr = new ArrayList<Integer>();
        newTestArr.add(-50);
        newTestArr.add(-4);
        newTestArr.add(-60);
        newTestArr.add(-1);
        newTestArr.add(-5);
        newTestArr.add(-69);
        basics.findMax(newTestArr);
        System.out.println(basics.oddArray(255));
        int[] avgTest1 = {1, 2, 3};
        int[] avgTest2 = {1, 22, 34, 56, 69, 22, 45};
        System.out.println(basics.average(avgTest1));
        System.out.println(basics.average(avgTest2));
        int[] greaterTest1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(basics.greaterThanY(greaterTest1, 4));
        int[] sqrTest1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(basics.squareArr(sqrTest1)));

        int[] noNegativesTest = {1, 2, -3, 4, 5, -6, 7};
        System.out.println(Arrays.toString(basics.noNegatives(noNegativesTest)));

        int[] testMinMaxAvg = {1, 10, 5, 28, 100, -4, 3, 22, 15};
        System.out.println(Arrays.toString(basics.getMinMaxAvg(testMinMaxAvg)));
        int[] testShiftArr1 = {1, 5, 10, 7, -2};
        int[] testShiftArr2 = {5, 10, 7, -2, 22, 69, 70, -5};
        System.out.println(Arrays.toString(basics.shiftArrByOne(testShiftArr1)));
        System.out.println(Arrays.toString(basics.shiftArrByOne(testShiftArr2)));


    }
}
