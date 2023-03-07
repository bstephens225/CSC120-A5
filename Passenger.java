public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage()); //no room
        }
    }

    public void getOffCar(Car c){
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.err.println(e.getMessage()); //not on board
        }
    }
}

/**Now that you've got a functional Car class, the Passenger class can be expanded to use the Car's methods to implement some of its own:
public void boardCar(Car c) can call c.addPassenger(this) to board a given Car (Hint: this method should be ready to catch the RuntimeException that will be thrown by c.addPassenger(...) in the event that the car is full.)
public void getOffCar(Car c) can call c.removePassenger(this) to get off a given Car (Hint: this method should be ready to catch the RuntimeException that will be thrown by c.removePassenger(...) in the event that the Passenger wasn't actually onboard.) */