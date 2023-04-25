import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {


public void setUp(){
    AirConditioner airConditioner = new AirConditioner();
}
    @Test
    public void TurnOnTest() {
        // Given
        AirConditioner airConditioner = new AirConditioner();
        //Check that
        airConditioner.isOn();
        //Assert true
        assertTrue(AirConditioner.isOn());

    }
    @Test
    public void DecreaseTemperatureTest(){

    }
}