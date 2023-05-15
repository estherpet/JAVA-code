import java.util.Arrays;

public class EnhanceForLoop {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};
        modify(numbers);
        System.out.println(Arrays.toString(numbers));
//        int number = 10;
//        modify(number);
//        System.out.println(number);


    }
    public static void modify(int [] num){
        for (int i = 0;i < num.length;i++){
            num [i] = num [i] * num [i];
        }
        System.out.println(num);
//        num = 40;
//        System.out.println(num);
    }
//        int [] number = {2,3,66,78,9};
//        for (int num:number){
//            System.out.println(num);
//        }

}
