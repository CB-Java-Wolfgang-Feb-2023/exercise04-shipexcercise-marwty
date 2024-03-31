import java.time.LocalDate;

public abstract class CruiseShip extends Ship{
    private int passengers;


    public CruiseShip(String name, LocalDate yearBuilt, int passengers) {
        super(name, yearBuilt);
        this.passengers = passengers;
    }

    public CruiseShip(String name, LocalDate yearBuilt) {
        super(name, yearBuilt);
    }
}
