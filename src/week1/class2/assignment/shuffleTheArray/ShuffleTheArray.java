package week1.class2.assignment.shuffleTheArray;

import java.util.Arrays;

/*
* Given the array nums consisting of n(n will be even) elements in the form [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input 1: nums = [2,5,1,3,4,7]
Output 1: [2,3,5,4,1,7]
Explanation 1: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Input 2: nums = [1,2,3,4,4,3,2,1]
Output 2: [1,4,2,3,3,2,4,1]
Constraints:
1 <= nums.length <= 1000
1 <= nums[i] <= 103
* */
public class ShuffleTheArray {

    public static void main(String[] args) {
        int[] input = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(input)));
    }

    static int[] shuffle(int[] input) {

        int[] resultantArray = new int[input.length];
        for (int i = 0; i < input.length / 2; i ++) {
            resultantArray[2 * i] = input[i];
            resultantArray[2 * i + 1] = input[(input.length / 2) + i];
        }
        return resultantArray;
    }


}
