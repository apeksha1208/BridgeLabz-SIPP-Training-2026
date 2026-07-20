package Heaps;

import java.util.*;

public class TopKLargest {

    public static List<Integer> topK(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {

            if (pq.size() < k)
                pq.offer(num);

            else if (num > pq.peek()) {

                pq.poll();

                pq.offer(num);
            }
        }

        return new ArrayList<>(pq);
    }

    public static void main(String[] args) {

        int[] arr = {10, 3, 50, 20, 15, 70};

        System.out.println(topK(arr, 3));
    }
}