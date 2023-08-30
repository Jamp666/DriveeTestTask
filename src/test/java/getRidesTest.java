import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class getRidesTest {
        @Test
        void testGetRides() {
                Coordinates driverRoute = new Coordinates(0,0,10,2);
                Coordinates someRoute1 = new Coordinates(11, 5,10,2);
                Coordinates someRoute2 = new Coordinates(-5,8,2,1);
                Coordinates someRoute3 = new Coordinates(1,1,11,3);
                Coordinates someRoute4 = new Coordinates(10,0,0,0);

                ArrayList<Coordinates> availableRoutes = new ArrayList<>();
                availableRoutes.add(someRoute1);
                availableRoutes.add(someRoute2);
                availableRoutes.add(someRoute3);
                availableRoutes.add(someRoute4);

                ArrayList<Coordinates> rideList = Main.getRides(driverRoute,availableRoutes);
                for (Coordinates c : rideList) {
                        System.out.println("X: " + c.getXA() + "  Y: " + c.getYA() + " -> X: " + c.getXB() + " Y: " + c.getYB() + " distance: " + (Main.calculateRouteDistance(driverRoute,c)));
               }
                Assertions.assertEquals(someRoute3,rideList.get(0));
                Assertions.assertEquals(someRoute1,rideList.get(1));
                Assertions.assertEquals(someRoute2,rideList.get(2));
                Assertions.assertEquals(someRoute4,rideList.get(3));

        }
}