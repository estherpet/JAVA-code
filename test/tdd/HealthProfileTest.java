package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {
    HealthProfile healthProfile = new HealthProfile("Diamond","Silver","Female","25-03-2003",13.55,66.9);
    @Test
    public void one(){

        assertEquals("Diamond",healthProfile.getFirstName());
        assertEquals("Silver",healthProfile.getLastName());
        assertEquals("Female",healthProfile.getGender());
        assertEquals("25-03-2003",healthProfile.getDateOfBirth());
        assertEquals(13.55,healthProfile.getHeight());
        assertEquals(66.9,healthProfile.getWeight());

    }
    @Test
    public void instanceVariableTest(){
        healthProfile.setFirstName("Mary");
        assertEquals("Mary",healthProfile.getFirstName());
        healthProfile.setLastName("Peter");
        assertEquals("Peter",healthProfile.getLastName());
        healthProfile.setGender("Male");
        assertEquals("Male",healthProfile.getGender());
        healthProfile.setDateOfBirth("23-03-2005");
        assertEquals("23-03-2005",healthProfile.getDateOfBirth());
        healthProfile.setHeight(34.5);
        assertEquals(34.5,healthProfile.getHeight());
        healthProfile.setWeight(66.7);
        assertEquals(66.7,healthProfile.getWeight());
    }
    @Test
    public void calculateAgeInYearsTest(){
        healthProfile.setDateOfBirth("23-03-2005");
        assertEquals(18,healthProfile.calculateAge());
    }
    @Test
    public void calculateMaximumHeartRateAndTargetHeartRateRange(){

        assertEquals(202,healthProfile.getmaximumHeartRate(18));
    }

}
