package LLD.ObserverDesignPattern;

public class WhetherStation {
    public static void main(String args[]){

        WhetherData weatherData = new WhetherData();

        TVDisplay tvDisplay = new TVDisplay();
        MobileDisplay mobileDisplay = new MobileDisplay();

        weatherData.registerObserver(tvDisplay);
        weatherData.registerObserver(mobileDisplay);

        weatherData.setMeasurements(80, 65);
        weatherData.setMeasurements(82, 70);
    }
}
