package chapter3;

public class PetroPurchase {
    private String stationLocation;
    private String petrotype;
    private int quality;
    private double price;
    private double percentageDiscount;

    public PetroPurchase (String stationLocation,String petrotype,int quality,double price,double percentageDiscount){
        this.stationLocation = stationLocation;
        this.petrotype = petrotype;
        this.quality = quality;
        this.price = quality;
        this.percentageDiscount = percentageDiscount;
    }
    public  void setStationLocation(String stationLocation){
        this.stationLocation = stationLocation;
    }
    public void setPetrotype(String petrotype){
        this.petrotype = petrotype;
    }
    public void setQuality(int quality){
        this.quality = quality;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setPercentageDiscount (double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public String getStationLocation(){
        return stationLocation;
    }
    public String getPetrotype(){
        return petrotype;
    }
    public int getQuality(){
        return quality;
    }
    public double getPrice(){
        return price;
    }
    public double getPercentageDiscount(){
        percentageDiscount = price * (percentageDiscount/100);
        return percentageDiscount;
    }
    public double getPurchaseAmount(double quality ){
        quality = price - percentageDiscount;
        return quality;

    }
}
