package weekendSnacks;

public class DoWhileLoopSum {
    public static void main(String[] args) {
        int [] array = {29,67,89,67,76,56,45,23,67};
        int i = 0;
        int sum = 0;
        do {
            System.out.println(sum);
            sum+= array[i];
            i+=1;
        }while (i < array.length);
    }
}
