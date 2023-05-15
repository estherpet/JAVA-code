import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] arr = new int[5][];
        arr [0] = new int[5];
        arr[1] = new  int[6];
        arr[2]= new int[10];
        arr[3]= new int[5];
        arr[4] = new int[5];

        for (int count = 0;count < arr[0].length;count++){
            arr[0][count]= count;
        }
        for (int count = 0;count < arr[1].length;count++) {
            arr[1][count] = count;
        }
        for (int count = 0; count < arr[2].length;count++){
            arr[2][count]= count;
        }
        for (int i = 0;i < arr[3].length;i++){
            arr[3][i]=( 1 + i) * 100;
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
