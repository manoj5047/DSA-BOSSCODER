package week1.class2.assignment.rickestCustomerWealth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* *
* You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i'th customer has in the j'th bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Input 1: accounts = [[1,2,3],[3,2,1]]
Output 1: 6
Explanation 1: 1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Input 2: accounts = [[1,5],[7,3],[3,5]]
Output 2: 10
Constraints:
m == accounts.length
n == accounts[i].length
1 <= n,m <= 50
1 <= accounts[i][j] <= 102

*
* */
public class RichestCustomerWealth {

    public static void main(String[] args) {
        // Initialize the outer list
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Add inner lists with specific values
        listOfLists.add(Arrays.asList(1, 2, 3));
        listOfLists.add(Arrays.asList(4, 5, 6));
        listOfLists.add(Arrays.asList(7, 8, 9));
        String result = String.valueOf(solve(listOfLists));
        System.out.println(result);
    }

    static int solve(List<List<Integer>> input) {
        int result = 0;
        for (List<Integer> currentAccount : input) {
            int tempAmount = 0;
            for (Integer integer : currentAccount) {
                tempAmount += integer;
            }
            if (tempAmount >= result) {
                result = tempAmount;

            }
        }
        return result;
    }
}
