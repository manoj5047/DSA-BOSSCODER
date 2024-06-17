package week1.class2.assignment.runningSumOf1dArray;

import java.util.Arrays;


public class RunningSumOf1dArray {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4};
        String result = Arrays.toString(sum(inputArray));
        System.out.println(result);
    }

    static int[] sum(int[] input) {
        int[] resultantArray = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            int runningSum = 0;
            for (int j = 0; j <= i; j++) {
                runningSum += input[j];
            }
            resultantArray[i] = runningSum;
        }

        return resultantArray;
    }
}
