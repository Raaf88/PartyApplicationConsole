package rafal.lewandowski;

import java.util.*;

public class Party {
    private final List<Guest> guests = new ArrayList<>();
    private final Set<String> meals = new HashSet<>();
    private final Map<Integer, Guest> phoneGuests = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuests() {
        System.out.println("Podaj imię gościa: ");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek: ");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Czy weganin? (T/N)");
        String isVeganString = scanner.nextLine();
        boolean isVegan;

        isVegan = isVeganString.equals("Y");
        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        meals.add(meal);
        phoneGuests.put(phoneNumber, guest);
        guests.add(guest);
    }

    public void displayMeals() {
        meals.forEach(System.out::println);
    }

    public void displayGuestsPhoneNumber() {
        System.out.println("Podaj numer telefonu: ");
        try {
            Integer phoneNumber = Integer.valueOf(scanner.nextLine());
            Guest guest = phoneGuests.get(phoneNumber);
            guest.displayGestsInformation();

        } catch (NullPointerException e) {
            System.out.println("Nie ma żadnych zapisanych numerów telefów.");
        }

    }

    public void displayGuests() {
        guests.forEach(Guest::displayGestsInformation);
        System.out.println();
    }
}
