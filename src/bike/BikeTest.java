package bike;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public  class BikeTest  {
    public void setUp(){
        Bike bike = new Bike();
    }

     @Test
    public void OnBikeTest(){
             Bike bike = new Bike();

             Bike.isOff(false);

            bike.toggleOn(true);
             assertTrue(true);
     }
     @Test
    public void OffBikeTest(){
        Bike bike = new Bike();

        Bike.isOn(true);
        assertTrue(true);

        bike.toggleOff(false);
        assertTrue(true);
     }
     @Test
    public void GearOneTest(){
        Bike gearOne = new Bike();


         gearOne.accelerateGearOne( 1,15);

         int result = gearOne.accelerateGearOne(1,15);
         assertEquals(16,result);
         System.out.println("Gear 1 added");

     }
     @Test
    public void GearTwoTest(){
        Bike gearTwo = new Bike();

        gearTwo.accelerateGearTwo(2,24);

        int result = gearTwo.accelerateGearTwo(2,24);
        assertEquals(26,result);
         System.out.println("Gear 2 added");
     }
     @Test
    public void GearThreeTest(){
        Bike gearThree = new Bike();

        gearThree.accelerateGearThree(3,35);
        int result = gearThree.accelerateGearThree(3,35);
        assertEquals(38,result);
         System.out.println("Gear 3 added");

     }
     @Test
    public void GearFourTest(){
        Bike gearFour = new Bike();

        gearFour.accelerateGearFour(4,44);
        int result = gearFour.accelerateGearFour(4,44);
        assertEquals(48,result);
         System.out.println("Gear 4 added");
     }




}