package app;

public interface SubscriberService {

    void getSubscribersWithCityCallDurationGreaterThan(int duration);

    void getSubscribersWithInterCityCall();

    void getSubscribersByLastNamePrefix(String prefix);

    void getTotalInternetTrafficByCity(String city);

    void getNegativeBalanceSubscribersCount();

}
