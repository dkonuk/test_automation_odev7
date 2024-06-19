package ENUM;

public class enum_planets {
    public enum Planet {
        MERKÜR(1, 0.31, 4879, 88),
        VENÜS(2, 0.72, 12104, 224),
        DÜNYA(3, 1, 12756, 365),
        MARS(4, 1.39, 6787, 687),
        JÜPITER(5, 5.2, 142984, 4331),
        SATÜRN(6, 9.58, 120536, 10747),
        URANÜS(7, 19.18, 51118, 30669),
        NEPTÜN(8, 30.06, 49528, 60190);
        private int number;
        public int getNumber() {
            return number;
        }
        private double distance;
        public double getDistance() {
            return distance;
        }
        private double radius;
        public double getRadius() {
            return radius;
        }
        private double orbitalPeriod;
        public double getOrbitalPeriod() {
            return orbitalPeriod;
        }
        Planet(int number, double distance, double radius, double orbitalPeriod) {
            this.number = number;
            this.distance = distance;
            this.radius = radius;
            this.orbitalPeriod = orbitalPeriod;
        }
    }
}

