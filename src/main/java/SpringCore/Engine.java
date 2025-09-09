package SpringCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String name;

    @Autowired
    public Engine(@Qualifier("engineName") String name){
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
