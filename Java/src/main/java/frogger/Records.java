package frogger;

import java.util.ArrayList;
import java.util.List;

public class Records {
    private final List<PersonInfo> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(PersonInfo personInfo) {
        if (records.contains(personInfo)) {
            return false;
        }
        records.add(personInfo);
        return true;
    }
}
