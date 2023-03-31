package problemSolving;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.
 */
public class NoOfProvinces {

    static void bfs(int[][] cities, Set<Integer> visited, int currentCity) {

        Queue<Integer> queue = new LinkedList<>();
        visited.add(currentCity);
        queue.add(currentCity);
        while (!queue.isEmpty()) {
            currentCity = queue.remove();
            for (int i = 0; i < cities.length; i++) {
                if (!visited.contains(i) && cities[currentCity][i] == 1) {
                    queue.add(i);
                    visited.add(i);
                }

            }
        }

    }

    private static int noOfProvinces(int[][] cities) {
        int provinces = 0;

        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < cities.length; i++) {
            if (visited.contains(i))
                continue;
            bfs(cities, visited, i);
            provinces++;
        }

        return provinces;
    }

    public static void main(String[] args) {
        System.out.println(noOfProvinces(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}})); //2
        System.out.println(noOfProvinces(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}})); //3
        System.out.println(noOfProvinces(new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}})); //1
    }
}
