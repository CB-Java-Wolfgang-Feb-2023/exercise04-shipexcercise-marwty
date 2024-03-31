import java.time.LocalDate;

public class CargoShip extends Ship{

    private final int  COST_CONSTANT = 20;
    private int tonnage;

//    public CargoShip() {
//        this(50);
//    }
//
//    public CargoShip(int tonnage) {
//        this.tonnage = tonnage;
//    }

    public CargoShip(String name, LocalDate localDate, int tonnage) {
        super(name, localDate);
        this.tonnage = tonnage;

    }

    @Override
    public Long getCost() {
        return (long) tonnage * COST_CONSTANT;
    }

    public int getTonnage() {
        return tonnage;
    }
    @Override
    public String toString() {
        return "The cost of ship 3 with the " + getName() + " and with the type " + getClass().getName() +" is: " + getCost();
    }
}
