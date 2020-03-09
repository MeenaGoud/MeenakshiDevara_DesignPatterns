package examples;

class SingletonClass {
    
    private static SingletonClass instance = new SingletonClass();
   
    private SingletonClass() {}
    
    public static SingletonClass getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("I'm a singleton object!");   
    }
}
public class Singleton {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.showMessage();
    }
}
