public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("Crieff", 50);
        System.out.println(bus1.getCapacity());

        Person pav = new Person("Pav");
        Person neil = new Person("Neil");
        Person issy = new Person("Issy");
        Person keith = new Person("Keith");
        System.out.println(pav.getName());
        System.out.println(bus1.getPassengerNumber());

        bus1.addPassenger(pav);
        System.out.println(bus1.getPassengerNumber());
        bus1.removePassenger(pav);
        System.out.println(bus1.getPassengerNumber());

        BusStop busStop1 = new BusStop("Methven");
        System.out.println(busStop1.getQueueSize());
        busStop1.addPerson(pav);
        System.out.println(busStop1.getQueueSize());
        busStop1.removePerson(pav);
        System.out.println(busStop1.getQueueSize());
        busStop1.addPerson(issy);
        busStop1.addPerson(pav);
        busStop1.addPerson(keith);
        busStop1.addPerson(neil);
        bus1.pickUp(busStop1);
        System.out.println(bus1.getPassengerNumber());
        System.out.println(busStop1.getQueueSize());
    }
}