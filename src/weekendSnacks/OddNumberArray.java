package weekendSnacks;

public class OddNumberArray {
    public static void main(String[] args) {
        int [] arrays = {2,24,34,12,32,15,79,24,50,7,5};
        for (int i = 0;i < arrays.length;i++){
            if (arrays[i] % 2 != 0){
                System.out.println(arrays[i]);
            }
        }
    }
}
