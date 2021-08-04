import java.util.ArrayList;
public class Basics {
    
    public void rangePrint() {
        for (int i=1; i<=255; i++) {
            System.out.println(i);
        }
    }
    public void printOdds() {
        for (int i=1; i<=255; i++) {
            if ((i%2) != 0) {
                System.out.println(i);
            }
        }
    }
    public Integer sumNums(int upToNum) {
        int sum = 0;
        for (int i=0; i<=upToNum; i++) {
            sum = sum+i;
        }
        return sum;
    }
    public void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void findMax(ArrayList<Integer> arr) {
        int max = arr.get(0); 
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println("Max value is: "+max);
    }
    public ArrayList oddArray(int numTo) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=0; i<=numTo; i++) {
            if((i%2) != 0) {
                y.add(i);
            }
        }
        return y;
    }
    public Integer average (int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int i=0; i<length; i++) {
            sum = sum + arr[i];
        }
        return (sum/length);
    }
    public Integer greaterThanY (int[] arr, int y) {
        int greater = 0; 
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > y) {
                greater = greater + 1;
            }
        }
        return greater;
    }
    public int[] squareArr(int[] arr) {
        int[] x = new int[arr.length];

        for (int i=0; i<arr.length; i++) {
            int sqr =  arr[i]*arr[i];
            x[i] = sqr;
        }
        return x;
    }
    public int[] noNegatives(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }
    public int[] getMinMaxAvg(int[] arr) {
        int[] minMaxAvg = new int[3];
        int sum = 0;
        int length = arr.length;
        int max = arr[0];
        int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        minMaxAvg[0] = min;
        minMaxAvg[1] = max;
        minMaxAvg[2] = (sum/length);
        return minMaxAvg;
    }
    public int[] shiftArrByOne (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (i != arr.length-1) {
                arr[i] = arr[i+1];
            }
            else {
                arr[i] = 0;
            }
        }
        return arr;
    }

}