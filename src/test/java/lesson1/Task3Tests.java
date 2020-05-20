package lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Tests {

    @Test
    public void sortedArray() {
        Event event1 = new Event(1988, 30, 9);
        Event event2 = new Event(1914, 30, 8);
        Event event3 = new Event(1984, 30, 7);
        Event event4 = new Event(19234, 30, 6);
        Event event5 = new Event(1913, 30, 5);
        Event[] events = {event1, event2, event3, event4, event5};

        Task3.sortEvents(events);
        Event[] expected = {event5, event2, event3, event1, event4};
        Assertions.assertArrayEquals(expected, events);
    }

    @Test
    public void sortedArraySecondVariant() {
        Event eventA = new Event(2020, 2, 3, "A");
        Event eventB = new Event(2020, 2, 2, "B");
        Event eventC = new Event(2020, 2, 2, "C");
        Event eventD = new Event(2020, 2, 2, "D");
        Event eventE = new Event(2020, 2, 1, "E");
        Event[] events = {eventA, eventB, eventC, eventD, eventE};

        Task3.sortEvents(events);
        Event[] expected = {eventE, eventB, eventC, eventD, eventA};
        Assertions.assertArrayEquals(expected, events);
    }

    @Test
    public void sortedArrayOneElementInArray() {
        Event event1 = new Event(1988, 30, 9);

        Event[] events = {event1};
        Task3.sortEvents(events);
        Event[] expected = {event1};
        Assertions.assertArrayEquals(expected, events);
    }
}
