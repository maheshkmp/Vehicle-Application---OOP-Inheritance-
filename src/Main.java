
public class Main {
    public static void main(String[] args) {
        SUV honda = new SUV("Honda",false);
        honda.move(40,0);
        honda.accelerate(20);
        System.out.println("Current gear: " + honda.getCurrentGear() );
        System.out.println("Current speed: " + honda.getCurrentSpeed() );
    }
}