package lesson1;

public class Task3 {

    // CPU: O(n2)
    // RAM: O(1)
    public static Event[] sortEvents (Event [] events) {
        for (int j = events.length-1; j >= 0; j--) {
            for (int i = 1; i <= j; i++) {
                if (events[i].getYear() < events[i - 1].getYear()) {
                    Event tempEvent = events[i];
                    events[i] = events[i - 1];
                    events[i - 1] = tempEvent;
                } else if (events[i].getYear() == events[i - 1].getYear()) {
                    if (events[i].getMonth() < events[i - 1].getMonth()) {
                        Event tempEvent = events[i];
                        events[i] = events[i - 1];
                        events[i - 1] = tempEvent;
                    } else if (events[i].getMonth() == events[i - 1].getMonth()) {
                        if (events[i].getDay() < events[i - 1].getDay()) {
                            Event tempEvent = events[i];
                            events[i] = events[i - 1];
                            events[i - 1] = tempEvent;
                        }
                    }
                }
            }
        }
        return events;
    }
}
