package forloop;

public class Diamond {
    public static void main(String[] args) {
        for (int star = 0;star > 9;star++){
            for (int star2 = 0;star2 < star;star2++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
