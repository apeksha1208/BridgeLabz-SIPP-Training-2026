package Heaps;

import java.util.PriorityQueue;

public class ERTriageQueue {

    static class Patient {

        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (a, b) -> b.severity - a.severity
        );

        pq.offer(new Patient("Amit", 4));
        pq.offer(new Patient("Riya", 8));
        pq.offer(new Patient("Karan", 2));
        pq.offer(new Patient("Rahul", 10));

        while (!pq.isEmpty()) {

            Patient p = pq.poll();

            System.out.println(p.name + " " + p.severity);
        }
    }
}
