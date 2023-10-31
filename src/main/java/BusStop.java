import java.util.ArrayList;

public class BusStop {

    private String name;

    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int getQueueSize() {
        return queue.size();
    }
    public void addPerson(Person person){
        this.queue.add(person);
    }

    public void removePerson(Person person){
        if(this.queue.contains(person)){
            this.queue.remove(person);
        }
    }

    public ArrayList<Person> getQueue() {
        return queue;
    }

    public void empty(){
        this.queue.clear();
    }
}
