package Hashing;
import java.util.HashMap;

public class MostFrequentErrorCode {

    public static int mostFrequent(int[] codes) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {

            int count = map.getOrDefault(code, 0) + 1;

            map.put(code, count);

            if (count > bestCount) {

                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }

    public static void main(String[] args) {

        int[] codes = {500, 404, 500, 403, 500, 404};

        System.out.println("Most Frequent Error Code = " + mostFrequent(codes));
    }
}
