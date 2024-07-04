public class Car extends Vehicle {

    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;


    public Car(String name, String type, int wheels, int doors, int gears, boolean isManual) {
        super(name);
        this.type = type;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("change method called: Change to " +currentGear+ " gear.");
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed,newDirection);
        System.out.println("Change speed called: Speed -> " +newSpeed+ " Direction -> "+newDirection);
    }

    //getters and setters


    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}

