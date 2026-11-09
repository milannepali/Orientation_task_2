
public class Main {
    public static void main(String[] args) {

        EventList list = new EventList();

        list.addEvent(new Event(10, EventType.ARRIVAL));
        list.addEvent(new Event(5, EventType.EXIT));
        list.addEvent(new Event(15, EventType.EXIT));
        list.addEvent(new Event(2, EventType.ARRIVAL));

        System.out.println("Next event:");
        System.out.println(list.getNextEvent());

        System.out.println("Remaining events:");
        list.printEvents();
    }
}
