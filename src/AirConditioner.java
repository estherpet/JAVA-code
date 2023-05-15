public class AirConditioner {

    public  boolean isOn;
    private int temperature;

    public void toggleOn(){
        isOn = !isOn;
    }
    public boolean isOn(){
        return isOn;
    }


    public int getTemperature() {
        return temperature;
    }

    public void increaseTemp() {
        if (temperature == 30)
            temperature = temperature;
        else temperature++;

    }
}
