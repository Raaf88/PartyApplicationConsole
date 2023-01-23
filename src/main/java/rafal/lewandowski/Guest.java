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

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", meal='" + meal + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", isVegan=" + isVegan +
                '}';
    }
}
