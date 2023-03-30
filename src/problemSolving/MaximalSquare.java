package problemSolving;

public class MaximalSquare {
    public static void main(String[] args) {
        char[][] input = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        System.out.println(maximalSquare(input));
    }

    public static int maximalSquare(char[][] a) {
//        int max = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            max = Math.max(Character.digit(matrix[i][0], 10), max);
//        }
//        for (int i = 0; i < matrix[0].length; i++) {
//            max = Math.max(Character.digit(matrix[0][i], 10), max);
//        }
//        for (int i = 1; i < matrix.length; i++) {
//            for (int j = 1; j < matrix[0].length; j++) {
//                if (matrix[i][j] == '1') {
//                    matrix[i][j] = Character.forDigit(
//                            Math.min(
//                                    Math.min(
//                                            Character.digit(matrix[i - 1][j], 10),
//                                            Character.digit(matrix[i][j - 1], 10)),
//                                    Character.digit(matrix[i - 1][j - 1], 10)) + 1, 10);
//                    max = Math.max(max, Character.digit(matrix[i][j], 10));
//                }
//            }
//        }
//
//
//        return max * max;


        if(a.length == 0) return 0;
        int m = a.length, n = a[0].length, result = 0;
        int[][] b = new int[m+1][n+1];
        for(int i=0; i<b.length; i++) {
            for(int j=0; j<b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println("------");
        }

        for (int i = 1 ; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(a[i-1][j-1] == '1') {
                    b[i][j] = Math.min(Math.min(b[i][j-1] , b[i-1][j-1]), b[i-1][j]) + 1;
                    result = Math.max(b[i][j], result); // update result
                }
            }
        }
        return result*result;
    }
}
/*
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[0].length; j++) {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println("------");
            }

 */
