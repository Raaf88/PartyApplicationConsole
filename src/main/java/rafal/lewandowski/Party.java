package rafal.lewandowski;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<String> guests = new ArrayList<>();

    public void addGuests(String name) {
        guests.add(name);
    }
    public List<String>getGuests(){
        return guests;
    }
}
