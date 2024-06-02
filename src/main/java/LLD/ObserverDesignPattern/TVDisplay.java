package LLD.ObserverDesignPattern;

public class TVDisplay implements Observer{

    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("TV Display - Temperature: " + temperature + "F, Humidity: " + humidity + "%, Pressure: ");
    }
}
