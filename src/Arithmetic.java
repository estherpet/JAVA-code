public class Arithmetic {

        public static int getMaxNum(int num1, int num2, int num3) {
           return  Math.max(num1, Math.max(num2, num3));
        }

    public static void main(String[] args) {
        int result = getMaxNum(8,170,10);
        System.out.println("Maximum = " + result);
        int result2 = getMinNum(60,9,12);
        System.out.println("Minimum = " + result2);
    }
    public static int getMinNum(int num1,int num2,int num3){
            return Math.min(num1,Math.min(num2,num3));

        }

    }

