package lesson1;

public class Task3 {
    // CPU: O(n^2)
    // RAM: O(1)
    public static void sortEvents(Event[] events) {
        for (int j = events.length - 1; j >= 0; j--) {
            for (int i = 1; i <= j; i++) {
                if (events[i].getYear() < events[i - 1].getYear() ||
                        events[i].getYear() == events[i - 1].getYear() && events[i].getMonth() < events[i - 1].getMonth() ||
                        events[i].getYear() == events[i - 1].getYear() && events[i].getMonth() == events[i - 1].getMonth() && events[i].getDay() < events[i - 1].getDay()) {
                    Event tempEvent = events[i];
                    events[i] = events[i - 1];
                    events[i - 1] = tempEvent;
                }
            }
        }
    }
}
