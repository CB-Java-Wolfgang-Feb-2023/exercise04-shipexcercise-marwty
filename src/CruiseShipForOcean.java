import java.time.LocalDate;

public class CruiseShipForOcean extends CruiseShip {
    public static final int COST_CONSTANT = 3000;
    private int numberOfFloors;
    private boolean hasSwimmingPools;

    public CruiseShipForOcean(String name, LocalDate yearBuilt, int numberOfFloors, boolean hasSwimmingPools) {
        super(name, yearBuilt);
        this.numberOfFloors = numberOfFloors;
        this.hasSwimmingPools = hasSwimmingPools;
    }

    public CruiseShipForOcean(int numberOfFloors, boolean hasSwimmingPools) {
        this("Default", LocalDate.now(), numberOfFloors, hasSwimmingPools);
    }

    public CruiseShipForOcean() {
        this(0, false);
    }

    public Long getCost() {
        if (hasSwimmingPools) {
            return (long) numberOfFloors * COST_CONSTANT;
        }
        return (long) (numberOfFloors * 0.9) * COST_CONSTANT;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasSwimmingPools() {
        return hasSwimmingPools;
    }

    public void setHasSwimmingPools(boolean hasSwimmingPools) {
        this.hasSwimmingPools = hasSwimmingPools;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", NumberOfFloors: " + numberOfFloors +
                ", HasSwimmingPools: " + hasSwimmingPools;
    }
}