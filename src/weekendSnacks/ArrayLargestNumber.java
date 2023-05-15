package weekendSnacks;

public class ArrayLargestNumber {
    public static void main(String[] args) {
        int [] number = {2,10,29,48,89,90};
        int max = number[0];
        for (int i = 1; i < number.length;i++){
            if (max < number[i]){
                max = number[i];
            }
        }
        System.out.println(max);

    }
}
