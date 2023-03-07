public class Engine {
    private FuelType fuelType;
    private double fuelLevel;
    private double fuelMax;
    
    public Engine(FuelType ft, double fuelLvl) {
        fuelType = ft;
        fuelLevel=fuelLvl;
    }

    //access max fuel level
    public double getFuelMax(){
        return fuelMax;
    }
    //access current fuel level
    public double getFuelLvl(){
        return fuelLevel;
    }
    //access fuel type
    public FuelType getFuelType(){
        return fuelType;
    }

    public void refuel(){
        fuelLevel=fuelMax;
    }

    public void go(){
        if(fuelLevel==0){
            System.out.println("you're out of fuel you cannot go!");
            throw new RuntimeException();
        }else if(fuelLevel>=1){
            fuelLevel-=1;
            System.out.println("you have "+ fuelLevel+ " left");
        }else if (fuelLevel<1){
            fuelLevel=0;
            System.out.println("you have "+ fuelLevel+ " left");
        }
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
    
}


/**Your Engine class will need:

a private FuelType attribute to indicate what type of fuel it uses, and doubles to store the current and maximum fuel levels (along with an approproate accessors for each)
a constructor, which takes in initial values for the attributes named above and sets them appropriately
a method public void refuel() which will reset the Engine's current fuel level to the maximum
a method public void go() which will decrease the current fuel level and print some useful information (e.g. remaining fuel level) provided the fuel level is above 0 (otherwise it should throw a RuntimeException containing an informative message) */