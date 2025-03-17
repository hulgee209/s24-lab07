package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {
    private final Road road;
    private int position;
    private final Records records;
    private final PersonInfo personInfo;

    public Frogger(Road road, int position, Records records, PersonInfo personInfo) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.personInfo = personInfo;
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean recordMyself() {
        return records.addRecord(personInfo);
    }
}
