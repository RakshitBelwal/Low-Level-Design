package LLD.ObserverDesignPattern;

public class MobileDisplay implements  Observer{

    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    void display(){
        System.out.println("Mobile Display - Temperature: " + temperature + "F, Humidity: " + humidity + "%, Pressure: ");
    }
}
