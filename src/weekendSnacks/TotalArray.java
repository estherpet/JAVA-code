package weekendSnacks;

public class TotalArray {
    public static void main(String[] args) {
        int [] array = {25,67,88,90,75,67};
        int sum = 0;
        for (int i = 0;i < array.length;i++) {
            sum += array[i];
        }
            System.out.println(sum);

    }
}
