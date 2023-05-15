package weekendSnacks;

public class EvenNumberArray {
    public static void main(String[] args) {
        int [] array = {2,4,5,6,8,9,76,75,24,65,9};
        for (int i = 0;i < array.length;i++){
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
