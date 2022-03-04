import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println("--------------Test Case 1--------------");
        System.out.println("Input: ");
        for (int[] row : arr1){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected output: 28");
        System.out.println("Output: " + hourGlassSum(arr1));
        int[][] arr2 = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        System.out.println("--------------Test Case 2--------------");
        System.out.println("Input: ");
        for (int[] row : arr2){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected output: 19");
        System.out.println("Output: " + hourGlassSum(arr2));
        int[][] arr3 = {{0, 1, 2, 3, 4, 5},{1, 2, 3, 4, 5, 6},{2, 3, 4, 5, 6, 7},{3, 4, 5, 6, 7, 8}, {4 , 5, 6, 7, 8, 9}, {5 , 6, 7, 8, 9, 9}};
        System.out.println("--------------Test Case 3--------------");
        System.out.println("Input: ");
        for (int[] row : arr3){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Expected output: 55");
        System.out.println("Output: " + hourGlassSum(arr3));
    }
    public static int hourGlassSum(int[][] arr){
        ArrayList<Integer> sums = new ArrayList<Integer>();
        for (int r = 0; r < arr.length - 2; r++){
            for (int c = 0; c < arr[0].length - 2; c++){
                int sum = 0;
                sum += arr[r][c] + arr[r][c + 1] + arr[r][c + 2] + arr[r + 1][c + 1] + arr[r + 2][c] + arr[r + 2][c + 1] + arr[r + 2][c + 2];
                sums.add(sum);
            }
        }
        int highest = sums.get(0);
        for (int i = 0; i < sums.size(); i++){
            if (sums.get(i) > highest){
                highest = sums.get(i);
            }
        }
        return highest;
    }
}
