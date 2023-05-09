package chapter3;

public class MainPetroPurchase {
    public static void main(String[] args) {
        PetroPurchase petroPurchase = new PetroPurchase("Yaba","pure Petro",20,2000,20);
        System.out.println("Station location is :" + petroPurchase.getStationLocation());
        System.out.println("Petro type is :" + petroPurchase.getPetrotype());
        System.out.println("Petro quality is :" + petroPurchase.getQuality());
        System.out.println("Petro price is :" + petroPurchase.getPrice());
        System.out.println("Percentage discount is : " + petroPurchase.getPercentageDiscount());

    }

}
