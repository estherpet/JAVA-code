package chapter3;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    public Clock(int hour, int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public void setHour(int hour){
        this.hour = hour;
        if (hour == 0){
            hour = 23;
        }
    }
    public void setMinute(int minute){
        this.minute = minute;
        if (minute == 0){
            minute = 59;
        }
    }
    public void setSecond(int second){
        this.second = second;
        if (second == 0){
            second = 59;
        }
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

}
