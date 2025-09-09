package SpringCore;

public class Car {
    private String carName;
    private Engine engine;

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
