import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;
    public Car(int maxCap) {
        ArrayList<Passenger> arr=new ArrayList<Passenger>(maxCap);
        passengers=arr;
    }
    public int getCapacity(){
        return maxCapacity;
    }

    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }

    public void addPassenger(Passenger p){
        if(seatsRemaining()!=0){
            passengers.add(p);
        }else{
            throw new RuntimeException("no room in this car!");
        }
    }

    public void removePassenger(Passenger p){
        if(passengers.contains(p)){
            passengers.remove(p);
        }else{
            throw new RuntimeException("passenger not found");
        }
    }

    public void printManifest(){
        if (passengers.size()==0){
            System.out.println("This car is EMPTY.");
        }else{
            System.out.println(passengers);
        }
    }
}

/**Next, we'll set to work on the Car class. The Car class will need:

a private ArrayList where it will store the Passengers currently onboard, and an int for the Car's maximum capacity (since ArrayLists will expand as we add objects, we'll need to manually limit their size)
a constructor, which takes in an initial value for the Car's maximum capacity and initializes an appropriately-sized ArrayList
accessor-like methods public int getCapacity() and public int seatsRemaining() that return the maximum capacity and remaining seats, respectively
methods public void addPassenger(Passenger p) and public void removePassenger(Passenger p) to add or remove a Passenger from the Car (Hint: don't forget to check that there are seats available if someone wants to board, and to confirm that the Passenger is actually onboard before trying to remove them! If you encounter a problem, throw a RuntimeException.)
and a final method public void printManifest() that prints out a list of all Passengers aboard the car (or "This car is EMPTY." if there is no one on board) */