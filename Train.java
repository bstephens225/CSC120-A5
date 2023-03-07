import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        Engine e= new Engine(fuelType, fuelCapacity);
        engine = e;
        for (int i=0;i<nCars;i++){
            Car c = new Car(passengerCapacity);
            cars.add(c);
        }
    }
    public Engine getEngine(){
        return engine;
    }

     //return the ith car
    public Car getCar(int i){
        return cars.get(i);
    }

    //return the maximum total capacity across all Cars
    public int getMaxCapacity() {
        if (cars.size()==0){
            return 0;
        }else{
            return cars.size()*cars.get(0).getCapacity();
        }
    }

    //return the number of remaining open seats across all Cars
    public int seatsRemaining() {
        int remaining=0;
        for (int i=0;i<cars.size();i++){
            remaining+=cars.get(i).seatsRemaining();
        }   
        return remaining;
    }

    //prints a roster of all Passengers on board
    public void printManifest(){
        cars.forEach(car->car.printManifest());
    } 
}


/**To assemble your Train, you'll need (at minimum):

a private Engine attribute, which we will mark with the keyword final to establish the composition relationship (e.g. private final Engine engine;)
a private ArrayList to keep track of the Cars currently attached
a constructor public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) which will initialize the Engine and Cars and store them
a couple of accessors:
public Engine getEngine()
public Car getCar(int i) to return the ith car
public int getMaxCapacity() which will return the maximum total capacity across all Cars
public int seatsRemaining() which will return the number of remaining open seats across all Cars
and finally, its own public void printManifest() that prints a roster of all Passengers onboard (Hint: your Cars can help!) */