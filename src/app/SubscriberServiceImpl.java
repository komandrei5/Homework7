package app;

public class SubscriberServiceImpl implements SubscriberService {

    @Override
    public void getSubscribersWithCityCallDurationGreaterThan(int duration) {
        System.out.println("Subscribers with the time of long-distance calls are more " + duration + " minutes:");
        Subscriber[] subscribers = SubscriberData.subscriberData();
        for (Subscriber s : subscribers) {
            if (s.getCityCallDuration() > duration) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void getSubscribersWithInterCityCall() {
        System.out.println("Subscribers who used long distance communication:");
        Subscriber[] subscribers = SubscriberData.subscriberData();
        for (Subscriber s : subscribers) {
            if (s.getInterCityCallDuration() > 0) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void getSubscribersByLastNamePrefix(String prefix) {
        System.out.println("Subscribers with a surname starting with a letter '" + prefix + "':");

        Subscriber[] subscribers = SubscriberData.subscriberData();
        for (Subscriber s : subscribers) {
            if (s.getLastName().startsWith(prefix)) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void getTotalInternetTrafficByCity(String city) {
        Subscriber[] subscribers = SubscriberData.subscriberData();
        double totalTraffic = 0.0;
        for (Subscriber s : subscribers) {
            if (s.getCity().equals(city)) {
                totalTraffic += s.getInternetTraffic();
            }
        }
        System.out.println("Total consumption of Internet traffic for the city '" + city + "': " + totalTraffic + " GB");
    }

    @Override
    public void getNegativeBalanceSubscribersCount() {
        Subscriber[] subscribers = SubscriberData.subscriberData();
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count++;
            }
        }
        System.out.println("The number of subscribers with a negative balance: " + count);
    }
}
