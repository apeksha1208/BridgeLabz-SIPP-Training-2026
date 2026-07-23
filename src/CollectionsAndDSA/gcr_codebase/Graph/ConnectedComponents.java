package Graph;

import java.util.*;

public class ConnectedComponents {

    static void dfs(Map<Integer, List<Integer>> graph,
                    int node,
                    Set<Integer> visited) {

        visited.add(node);

        for (int next : graph.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(next))
                dfs(graph, next, visited);
        }
    }

    static int countComponents(Map<Integer, List<Integer>> graph, int n) {

        Set<Integer> visited = new HashSet<>();

        int components = 0;

        for (int i = 0; i < n; i++) {

            if (!visited.contains(i)) {

                components++;

                dfs(graph, i, visited);
            }
        }

        return components;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1));
        graph.put(1, Arrays.asList(0));

        graph.put(2, Arrays.asList(3));
        graph.put(3, Arrays.asList(2));

        System.out.println(countComponents(graph, 4));
    }
}