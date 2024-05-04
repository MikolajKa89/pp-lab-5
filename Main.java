import company.implementations.EmailMessenger;

public class Main {

    public static void main(String[] args) {
        EmailMessenger messenger = new EmailMessenger();
        messenger.sendMessage("Przykładowa wiadomość e-mail");
    }
}
