import java.util.Scanner;

public class sudoki {
    public static void main(String[] args) {
        int [][] board = sudoki();

    }
    private static int[][] sudoki() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 9");
        int [][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board [i][j] = input.nextInt();
            }
        }
        return board;
    }
}