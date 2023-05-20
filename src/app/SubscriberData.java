package app;

public class SubscriberData {
    public static Subscriber[] subscriberData() {

        Subscriber[] array = new Subscriber[10];

        array[0] = new Subscriber(1, "Smith", "John", "New York", "1234567890",
                "C123", 100.0, 50, 0, 5.5);
        array[1] = new Subscriber(2, "Johnson", "Michael", "Los Angeles", "9876543210",
                "C456", 150.0, 60, 0, 2.3);
        array[2] = new Subscriber(3, "Williams", "Emily", "Chicago", "5555555555",
                "C789", 200.0, 70, 0, 7.8);
        array[3] = new Subscriber(4, "Brown", "Emma", "Houston", "1111111111",
                "C012", -50.0, 40, 0, 1.2);
        array[4] = new Subscriber(5, "Jones", "Daniel", "San Francisco", "9999999999",
                "C345", -20.0, 80, 1, 3.6);
        array[5] = new Subscriber(6, "Miller", "Olivia", "Seattle", "7777777777",
                "C678", 300.0, 90, 5, 6.1);
        array[6] = new Subscriber(7, "Davis", "Ava", "Boston", "4444444444",
                "C901", 50.0, 55, 5, 1.9);
        array[7] = new Subscriber(8, "Sem", "William", "Kyiv", "2222222222",
                "C234", 0.0, 75, 0, 4.4);
        array[8] = new Subscriber(9, "Rodriguez", "Sophia", "Dallas", "8888888888",
                "C567", -10.0, 65, 0, 2.7);
        array[9] = new Subscriber(10, "Wilson", "James", "Kyiv", "3333333333",
                "C890", 80.0, 85, 0, 5.0);
        return array;
    }
}
