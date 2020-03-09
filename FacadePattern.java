package examples;

interface Animall {
    void feed();
}
class Lion implements Animall {
    @Override
    public void feed() {
        System.out.println("The lion is being fed");
    }
}

class Wolf implements Animall {
    @Override
    public void feed() {
        System.out.println("The wolf is being fed");
    }    
}
class Bear implements Animall {
    @Override
    public void feed() {
        System.out.println("The bear is being fed");
    }    
}
class ZooKeeper {
    private Animall lion;
    private Animall wolf;
    private Animall bear;
    
    public ZooKeeper() {
        lion = new Lion();
        wolf = new Wolf();
        bear = new Bear();
    }
    
    public void feedLion() {
        lion.feed();
    }
    
    public void feedWolf() {
        wolf.feed();
    }
    
    public void feedBear() {
        bear.feed();
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();
        
        zookeeper.feedLion();
        zookeeper.feedWolf();
        zookeeper.feedBear();        
    }
}
