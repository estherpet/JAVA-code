public class ArrayList {
    public static void main(String[] args) {

        try {
            int[] array = {2, 4, 5, 7};
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println();

        }
    }
}
//        int [] numbers = new int[5];
//        int [] number ,age;
//        number = new int[4];
//        age= new int[3];
//        int [] figures = {1,2,3,4,5,6};
//
//
//        String [] names = new String[]{
//                "peter","sonia","thelma","shalom",
//                "diamond","Desire","divine"
//        };
//        System.out.println(names[4]);
//        System.out.println(names[names.length-2]);
//        System.out.println(names.length);
//        int [] number = new int[5];
//        number[0] = 3;
//        number[1] = 4;
//        number[2] = 5;
//        number[3]= 6;
//        number[4]= 7;
//        System.out.println(Arrays.toString(number));

//        int[] number = new int[50];
//        int num;
//        for (num = 0; num < number.length; num++) {
//            number[num] = 5;
//        }
//        Arrays.fill(number,5);
//        System.out.println(Arrays.toString(number));


