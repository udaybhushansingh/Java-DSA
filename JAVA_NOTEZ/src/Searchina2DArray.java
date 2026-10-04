import java.util.Scanner;

public class Searchina2DArray {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] arr = new int[rows][cols];


            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int target = sc.nextInt();

            int[] ans = search2D(arr, target);

            if (ans[0] == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at [" + ans[0] + ", " + ans[1] + "]");
            }
        }

        static int[] search2D(int[][] arr, int target) {

            for (int row = 0; row < arr.length; row++) {

                for (int col = 0; col < arr[row].length; col++) {

                    if (arr[row][col] == target) {
                        return new int[]{row, col};
                    }
                }
            }

            return new int[]{-1, -1};
        }
    }