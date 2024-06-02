package LLD.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WhetherData implements Subject{

    private List<Observer> observerList;
    private float temperature;
    private float humidity;

    public WhetherData(){
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {

        for(Observer observer : observerList){
            observer.update(temperature, humidity);
        }

    }

    public void setMeasurements(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserver();
    }

}
