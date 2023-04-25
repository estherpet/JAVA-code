package forloop;

public class Triangle{
    public static void main(String[] args) {
        for (int star = 10; star > 0; star--) {
            for (int star2 = 0; star2 < star; star2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}