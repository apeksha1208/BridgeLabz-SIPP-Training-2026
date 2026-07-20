package Hashing;
import java.util.*;
public class FraudPairDetection {

    public static int[] findPair(int[] amounts, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];

            if (map.containsKey(complement)) {

                return new int[]{
                        map.get(complement),
                        i
                };
            }

            map.put(amounts[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] amounts = {20, 50, 30, 70};

        int target = 100;

        int[] ans = findPair(amounts, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
