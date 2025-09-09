package SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String carName;
    private Engine engine;

    @Autowired
    public Car( @Qualifier("carName")String carName, Engine engine) {
        this.carName = carName;
        this.engine = engine;
    }

    public Car(String carName) {
        this.carName = carName;
    }

    public Car(){

    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Starting Car "+carName);
        engine.start();
    }
}
