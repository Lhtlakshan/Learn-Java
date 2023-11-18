package OOP.Polyorphism;

public class Demo {
    
    public static void main(String[] args){
        Car car = new Car();
        Vehicle van = new Van();

        System.out.println(car.park());
        System.out.println(van.park());
    }
    
}
