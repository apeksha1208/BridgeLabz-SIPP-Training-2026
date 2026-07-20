package Heaps;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int kthLargest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {

            if (pq.size() < k)
                pq.offer(num);

            else if (num > pq.peek()) {

                pq.poll();

                pq.offer(num);
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 6, 4};

        System.out.println(kthLargest(arr, 2));
    }
}