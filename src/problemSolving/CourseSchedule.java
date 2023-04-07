package problemSolving;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/*
fix the bug
 */
public class CourseSchedule {

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> adjList = new ConcurrentHashMap<>();

        for (int[] item : prerequisites) {
            adjList.computeIfAbsent(item[0], k -> new ArrayList<>()).add(item[1]);
        }

        Set<Integer> visited = new HashSet<>();

        boolean result = false;

        for (Map.Entry<Integer, List<Integer>> entry :
                adjList.entrySet()) {
            if (!visited.contains(entry.getKey())) {
                result = dfs(adjList, visited, entry.getKey());
                if (!result)
                    return false;
            }
        }
        return result;
    }

    private static boolean dfs(Map<Integer, List<Integer>> adjList, Set<Integer> visited,
                               int currentCourse) {
        if(visited.contains(currentCourse))
            return false;
        if (!adjList.containsKey(currentCourse))
            return true;
        if(adjList.get(currentCourse).isEmpty())
            return true;
        visited.add(currentCourse);

        if (adjList.containsKey(currentCourse)) {
            for (Integer preReq :
                    adjList.get(currentCourse)) {
                if (visited.contains(preReq))
                    return false;
                visited.add(preReq);
                dfs(adjList, visited, preReq);
            }
        }
        visited.remove(currentCourse);
        adjList.remove(currentCourse);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][]{{1, 0}}));
        System.out.println(canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }

}