package SpringCore;

public class Engine {
    private String name;

    public Engine(String name){
        this.name=name;
    }

    public Engine(){

    }

    public  void setName(String name){
        this.name=name;
    }

    public void start(){
        System.out.println(name+" engine is starting");
        System.out.println("Engine is started");
    }
}
