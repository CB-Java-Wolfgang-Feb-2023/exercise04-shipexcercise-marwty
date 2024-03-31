import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShipDemo {
    public static void main(String[] args) {
        List<Ship> ships = new ArrayList<>();
        ships.add(new CargoShip("Cargo1", LocalDate.of(2000, 1, 1), 1000));
        ships.add(new CruiseShipForOcean("Ocean1", LocalDate.of(2005, 1, 1), 10, true));
        ships.add(new CruiseShipForRiver("River1", LocalDate.of(2010, 1, 1), 100));

        long totalCost = 0;
        for (Ship ship : ships) {
            totalCost += ship.getCost();
            System.out.println(ship.getName() + "'s cost: " + ship.getCost() + " $");
        }

        System.out.println("The Sum of all costs: " + totalCost + " $");
        System.out.println("The Average cost of all the ships: " + ShipUtils.calculateAverageCost(ships) + " $");
    }
}
