import java.util.Random;

public class NameGenerator {


    public static String generateName() {
        String[] firstNames = {"Emma", "Olivia", "Ava", "Isabella", "Sophia", "Mia", "Charlotte", "Amelia", "Evelyn", "Abigail"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};
        Random rand = new Random();
        String firstName1 = firstNames[rand.nextInt(firstNames.length)];
        String lastName1 = lastNames[rand.nextInt(lastNames.length)];
        return firstName1 + " " + lastName1;
    }
    public static String generateName2() {
        String[] firstNames = {"Liam", "Noah", "Ethan", "Logan", "Lucas", "Jackson", "Aiden", "Caleb", "Mason", "Elijah"};
        String[] lastNames = {"Anderson", "Bailey", "Barnes", "Carter", "Clark", "Evans", "Foster", "Gray", "Hall", "Harris"};
        Random rand = new Random();
        String firstName = firstNames[rand.nextInt(firstNames.length)];
        String lastName = lastNames[rand.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }
}