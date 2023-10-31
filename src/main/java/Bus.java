import java.util.ArrayList;
public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerNumber(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if(this.getPassengerNumber() < this.capacity){
            this.passengers.add(person);
        }
    }
    public void removePassenger(Person person){
        if(this.passengers.contains(person)){
            this.passengers.remove(person);
        }
    }

    public void pickUp(BusStop busStop){
        for(Person person : busStop.getQueue()){
            this.addPassenger(person);
        }
        busStop.empty();
    }
}
