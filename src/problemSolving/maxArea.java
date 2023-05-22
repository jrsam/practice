package problemSolving;

public class maxArea {
//
//
//
//__|_____
//| | |     |
//| | | |   |
//|_|_|_|_|_|
//
//
//
//
//            |
//            | |
//            | | |
//            |_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|

    static int findMaxArea(int[] input) {
        int start = 0;
        int end = input.length - 1;

        int maxArea = 0;

        while (start <= end) {
            int currArea = 0;
            if (input[start] < input[end]) {
                currArea = input[start] * (end - start);
                start++;
            } else if (input[start] > input[end]) {
                currArea = input[end] * (end - start);
                end--;
            } else if (input[start] == input[end]) {
                currArea = input[start] * (end - start);
                start++;
                end--;
            }

            if (maxArea < currArea)
                maxArea = currArea;

        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 4, 3, 2, 1, 3};

        System.out.println(findMaxArea(input));

    }

}
