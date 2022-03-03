import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 0, 0 ,0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
        System.out.println(hourGlassSum(arr));

    }
    public static int hourGlassSum(int[][] arr){
        ArrayList<Integer> sums = new ArrayList<Integer>();
        for (int r = 0; r < arr.length - 2; r++){
            int sum = 0;
            for (int c = 0; c < arr[0].length - 2; c++){
                ArrayList<Integer> positions = hourGlassPosition(r, c);
                for (int i = 0; i < positions.size() - 2; i++){
                    sum += arr[positions.get(i)][positions.get(i + 1)];
                    sums.add(sum);
                    i++;
                }
                System.out.println(sum);
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
    private static ArrayList<Integer> hourGlassPosition(int row, int col){
        ArrayList<Integer> positions = new ArrayList<Integer>();
        positions.add(row);
        positions.add(col);
        positions.add(row);
        positions.add(col + 1);
        positions.add(row);
        positions.add(col + 2);
        positions.add(row + 1);
        positions.add(col + 1);
        positions.add(row + 2);
        positions.add(col);
        positions.add(row + 2);
        positions.add(col + 1);
        positions.add(row + 2);
        positions.add(col + 2);
        return positions;
    }
}
