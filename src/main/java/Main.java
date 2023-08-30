import java.util.*;

public class Main {
        public static void main(String[] args) {

        }

        public static ArrayList<Coordinates> getRides(Coordinates driverRoute, ArrayList<Coordinates> availableRoutes) {
                Map<Double,Coordinates> rides = new TreeMap<>();
                for (Coordinates route : availableRoutes) {
                        rides.put(calculateRouteDistance(driverRoute,route), route);
                }
                return new ArrayList<>(rides.values());
        }

        public static double calculateRouteDistance(Coordinates driverRoute, Coordinates someRoute) {
                double firstStop = Math.sqrt(Math.pow(someRoute.getXA() - driverRoute.getXA(), 2) + Math.pow(someRoute.getYA() - driverRoute.getYA(), 2));
                double secondStop = Math.sqrt(Math.pow(someRoute.getXB() - someRoute.getXA(), 2) + Math.pow(someRoute.getYB() - someRoute.getYA(), 2));
                double lastStop = Math.sqrt(Math.pow(driverRoute.getXB() - someRoute.getXB(), 2) + Math.pow(driverRoute.getYB() - someRoute.getYB(), 2));

                return firstStop + secondStop + lastStop;
        }
}