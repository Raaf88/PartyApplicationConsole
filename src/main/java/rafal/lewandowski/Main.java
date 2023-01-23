package rafal.lewandowski;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party party = new Party();
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wyświetl gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> System.out.println(party.getGuests());
                case 2 -> party.addGuests();
                case 3 -> System.out.println("Wyświetlanie potraw");
                case 4 -> System.out.println("Znajdowanie gościa po numerze telefonu");
                case 5 -> shouldContinue = false;
            }

        }

    }
}