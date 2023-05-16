import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    AirConditioner epAc = new AirConditioner();
    @Test
    public void TurnOnTest() {
    epAc.toggleOn();
    assertTrue(epAc.isOn());
    }
    @Test
    public  void setTempTest(){
        epAc.toggleOn();
        assertEquals(0,epAc.getTemperature());
        epAc.increaseTemp();
        assertEquals(1, epAc.getTemperature());

    }
    @Test
    public void maximumTempTest(){
        epAc.toggleOn();
        for (int i = 1;i <= 30;i++)epAc.increaseTemp();
        epAc.increaseTemp();
        assertEquals(30,epAc.getTemperature());
    }
    @Test
    public void minimumTempTest(){
        epAc.toggleOn();

    }
}