package Hashing;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int answer = 0;

        for (int num : arr) {

            sum += num;

            answer += map.getOrDefault(sum - k, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -2, 2};

        int k = 3;

        System.out.println(subarraySum(arr, k));
    }
}