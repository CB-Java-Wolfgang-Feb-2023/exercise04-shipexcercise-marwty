import java.time.LocalDate;

public class CruiseShipForRiver extends  CruiseShip{
    public static final double COST_CONSTANT = 3000.0;
    private int lengthOfRiverInKm;

    public CruiseShipForRiver(String name, LocalDate yearBuilt, int lengthOfRiverInKm) {
        super(name, yearBuilt);
        this.lengthOfRiverInKm = lengthOfRiverInKm;
    }

    public CruiseShipForRiver(int lengthOfRiverInKm) {
        this("River", LocalDate.now(), lengthOfRiverInKm);
    }

    public CruiseShipForRiver() {
        this(0);
    }

    public Long getCost() {
        return (long) (lengthOfRiverInKm * COST_CONSTANT);
    }

    public int getLengthOfRiverInKm() {
        return lengthOfRiverInKm;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", LengthOfRiverInKm: " + lengthOfRiverInKm;
    }
}
