package rafal.lewandowski;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    private List<String> guests = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuests() {
        System.out.println("Podaj imię gościa: ");
        String name = scanner.nextLine();
        guests.add(name);
    }

    public List<String> getGuests() {
        return guests;
    }
}
