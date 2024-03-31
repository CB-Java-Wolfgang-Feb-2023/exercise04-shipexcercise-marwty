import java.util.List;

public class ShipUtils {
//    public static long calculateAllCosts(List<Ship> ships) {
//        long totalCost = 0;
//        for (Ship ship : ships) {
//            totalCost += ship.getCost();
//        }
//        return totalCost;
//    }
//
//    public static double calculateAverageCost(List<Ship> ships) {
//        if (ships.isEmpty()) return 0;
//        long totalCost = calculateAllCosts(ships);
//        return (double) totalCost / ships.size();
//    }

    public static long calculateAllCosts(List<Ship> ships) {
        return ships.stream()
                .mapToLong(Ship::getCost)
                .sum();
    }

    public static double calculateAverageCost(List<Ship> ships) {
        return ships.stream()
                .mapToLong(Ship::getCost)
                .average()
                .orElse(0);
    }
}
