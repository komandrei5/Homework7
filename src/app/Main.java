package app;

public class Main {
    public static void main(String[] args) {

        SubscriberService subscriberService = new SubscriberServiceImpl();
        subscriberService.getSubscribersWithCityCallDurationGreaterThan(80);
        System.out.println();
        subscriberService.getSubscribersWithInterCityCall();
        System.out.println();
        subscriberService.getSubscribersByLastNamePrefix("S");
        System.out.println();
        subscriberService.getTotalInternetTrafficByCity("Kyiv");
        System.out.println();
        subscriberService.getNegativeBalanceSubscribersCount();
    }
}
