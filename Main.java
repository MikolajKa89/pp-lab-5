import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {

    public static <Messenger> void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("Jan Kowalski", 30);
            people[1] = new Person("Anna Nowak", 25);
            people[2] = new Person("Piotr Zieliński", 40);
            people[3] = new Person("Marta Wiśniewska", 35);
            people[4] = new Person("Krzysztof Górski", 22);

            for (Person person : people) {
                int sum = MathUtils.add(person.getAge(), b);
                System.out.println("Suma wieku " + person.getName() + " i " + b + " wynosi: " + sum);

                @SuppressWarnings("unchecked")
                Messenger messenger = (Messenger) new EmailMessenger();
                ((EmailMessenger) messenger).sendMessage("Suma wieku " + person.getName() + " i " + b + " wynosi: " + sum);
            }
        } catch (InvalidAgeException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}
