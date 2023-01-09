package restaurant.entities.tables.interfaces;

public class InDoors extends BaseTable {

    private static final double PRICEPERPERSON = 3.50;

    public InDoors(int number, int size) {
        super(number, size, PRICEPERPERSON);
    }
}
