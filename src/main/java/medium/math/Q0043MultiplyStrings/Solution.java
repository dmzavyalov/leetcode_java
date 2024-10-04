package medium.math.Q0043MultiplyStrings;

/*
https://leetcode.com/problems/multiply-strings/
Time: O(n*m)
Space: O(n+m)
 */

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];

        num1 = reverse(num1);
        num2 = reverse(num2);

        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                int digit = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                res[i + j] += digit;    // Ex 9 * 9 = 81
                res[i + j + 1] += res[i + j] / 10 ; // 81 / 10 = 8
                res[i + j] = res[i + j] % 10;   // 81 % 10 = 1
            }
        }

        reverse(res);

        //Skip leading zeroes
        int startIndex = 0;
        while (startIndex < res.length) {
            if (res[startIndex] != 0) {
                break;
            }
            startIndex++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < res.length; i++) {
            sb.append(res[i]);
        }

        return sb.toString();
    }

    private String reverse(String str) {
        var sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    private void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
