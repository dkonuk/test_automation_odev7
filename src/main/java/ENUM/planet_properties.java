package ENUM;
import ENUM.enum_planets.Planet;

public class planet_properties
{public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println("Gezegen Adı ve Özellikleri");
            System.out.println("---------------------------");
            System.out.println(planet);
            System.out.println("Güneş sisteminde ki sırası " +planet.getNumber());
            System.out.println("Güneş'e olan mesafesi " +planet.getDistance()+ "AU");
            System.out.println("Gezegenin çapı " +planet.getRadius()+ "km");
            System.out.println("Gezegenin orbital periyodu " +planet.getOrbitalPeriod()+ "Gün");
        }
    }
}
