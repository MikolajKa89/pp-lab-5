import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int sum = MathUtils.add(a, b);
        System.out.println("Suma: " + sum);

        EmailMessenger messenger = new EmailMessenger();
        messenger.sendMessage("Suma " + a + " i " + b + " wynosi: " + sum);
    }
}
