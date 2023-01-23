package rafal.lewandowski;

public class Guest {
    private final String name;
    private final String meal;
    private final int phoneNumber;
    private final boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGestsInformation() {
        System.out.println("Imię: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);

        String isVeganString = isVegan ? "Tak" : "Nie";
        System.out.println("Weganin?: " + isVeganString);


    }

}
