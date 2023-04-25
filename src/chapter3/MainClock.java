package chapter3;

public class MainClock {
    public static void main(String[] args) {
        Clock clockObject = new Clock(23,59,59);
        System.out.println("Hour :" + clockObject.getHour());
        System.out.println("Minute :" + clockObject.getMinute());
        System.out.println("Second :" + clockObject.getSecond());
    }
}
