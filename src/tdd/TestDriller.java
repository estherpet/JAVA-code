package tdd;

public class TestDriller {


    public static double amount(int copy) {
        double price = 1100;
        if (copy >= 500){
            price = 1000;
        } else if (copy >= 200 && copy < 499) {
            price = 1100;
        } else if (copy >= 100 && copy < 200) {
            price = 1200;
        } else if (copy >= 50 && copy < 100) {
            price = 1300;
        } else if (copy >= 30 && copy < 50) {
            price = 1500;
        } else if (copy >= 10 && copy < 30) {
            price = 1600;
        } else if (copy >= 5 && copy < 10) {
            price = 1800;
        } else if (copy >= 1 && copy < 5) {

            price = 2000;
        }


        return price;
    }
}
