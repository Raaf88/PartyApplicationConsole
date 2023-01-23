package rafal.lewandowski;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    private final List<Guest> guests = new ArrayList<>();
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
        guests.add(guest);
    }

    public void displayGuests() {
        guests.forEach(System.out::println);
    }
}
