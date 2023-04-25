package chapter3;

public class MainCar {
    public static void main(String[] args) {
        Car carObject1 = new Car("Sapphire", "2023", 500000);
        Car carObject2 = new Car("Diamond", "2025", 90000);
        System.out.println("Model : " + carObject1.getModel());
        System.out.println("Year :" + carObject1.getYear());
        System.out.println("price :" + carObject1.getPrice());
        System.out.println("Car 1 :" + carObject1.getPrice());
        carObject1.giveDiscount(5);
        System.out.println("Discount :" + carObject1.getPrice());

        System.out.println("Model :" + carObject2.getModel());
        System.out.println("Year :" + carObject2.getYear());
        System.out.println("price :" + carObject2.getPrice());
        System.out.println("Car 2 :" + carObject2.getPrice());
        carObject2.giveDiscount(7);
        System.out.println("Discount :" + carObject2.getPrice());
    }
}