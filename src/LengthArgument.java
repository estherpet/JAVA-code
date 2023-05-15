public class LengthArgument {
    public static void main(String[] args) {
   int total = add(1,4,6,7,8,8,9,19,12);
    System.out.println("Total is : " + total);
   }
        public static int add(int... number) {
        int total = 0;
        for (int num: number) {
            total += num;
        }
            return total;
    }
}