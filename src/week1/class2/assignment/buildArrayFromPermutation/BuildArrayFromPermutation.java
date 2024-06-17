package week1.class2.assignment.buildArrayFromPermutation;

import java.util.Arrays;



public class BuildArrayFromPermutation {


    public static int[] build(int[] input) {
        int[] resultantArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            resultantArray[i] = input[input[i]];
        }
        return resultantArray;

    }
}
