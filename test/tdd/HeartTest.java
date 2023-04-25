package tdd;

import chapter3.HeartRate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartTest {
    HeartRate heartRate;
    @BeforeEach
    public void setUp () {
        heartRate = new HeartRate("Dele", "Timi", "23-Dec-2000");
    }
    @Test
    public void HeartRateExistTest(){
        HeartRate heartRate = new HeartRate("Esther","peter","28-mar-2005");
        assertNotNull(heartRate);
    }

    @Test
    public  void getFirstNameTest () {
        String firstName = heartRate.getFirstName();
        assertEquals("Dele", firstName);
    }
    @Test
    public void getLastNameTest(){
        String lastName = heartRate.getLastName();
        assertEquals("Timi",lastName);
    }
    @Test
    public void getDateOfBirthTest(){
        String dateOfBirth = heartRate.getDateOfBirth();
        assertEquals("23-Dec-2000",dateOfBirth);
    }
    @Test
    public void setFirstNameTest(){
         heartRate.setFirstName("queenie");
         assertEquals("queenie",heartRate.getFirstName());
    }
    @Test
    public void setLastNameTest(){
        heartRate.setLastName("Diamond");
        assertEquals("Diamond",heartRate.getLastName());
    }
    @Test
    public void setDateOfBirthTest(){
        heartRate.setDateOfBirth("25-mar-2025");
        assertEquals("25-mar-2025",heartRate.getDateOfBirth());
    }
    @Test
    public void getAgeTest(){
        heartRate.setDateOfBirth("25-mar-2025");
        assertEquals(18,heartRate.getAge());
    }


}
