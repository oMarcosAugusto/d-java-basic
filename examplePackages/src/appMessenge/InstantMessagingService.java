package appMessenge;

public class InstantMessagingService {
    private boolean isConnectedToInternet;

    public InstantMessagingService() {
        this.isConnectedToInternet = validateInternetConnection();
    }

    public  void sendMessage() {
        if (isConnectedToInternet) {
            System.out.println("Sending message");
            saveMessageHistory();
        } else {
            System.out.println("No internet connection. Message sending failed.");
            return;
        }
        receiveMessage();
    }

    public  void receiveMessage() {
        System.out.println("Receiving message");
    }

    private boolean validateInternetConnection() {
        if (isConnectedToInternet) {
            System.out.println("Internet connection already validated.");
            return true;
        }
        System.out.println("Validating if you are connected to the internet");
        double randomValue = Math.random();
        return randomValue > 0.5;
    }

    protected void saveMessageHistory() {
        System.out.println("Saving message history");
    }
}