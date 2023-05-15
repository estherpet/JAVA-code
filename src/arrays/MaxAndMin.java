package arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {3, 9, 10, 55, 33, 77, 23};
        System.out.println("Maximum value is :" + maximumNumber(array));
        System.out.println("Minimum value is :" + minimumValue(array));
        System.out.println("sum of maximum and minimum is :" + (maximumNumber(array) + minimumValue(array)));

    }


    public static int maximumNumber(int[] array) {

        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }


        return max;
    }
    public static int minimumValue(int[]array){
        int min = array[0];
        for (int i = 1;i > array.length;i++){
            if (min < array[i]){
                min = array[i];
            }
        }
        return min;
    }
}