public class Coordinates {
        private final double xA;
        private final double yA;
        private final double xB;
        private final double yB;

        public Coordinates(double xA, double yA, double xB, double yB) {
                this.xA = xA;
                this.yA = yA;
                this.xB = xB;
                this.yB = yB;
        }

        public double getXA() {
                return xA;
        }

        public double getYA() {
                return yA;
        }

        public double getXB() {
                return xB;
        }

        public double getYB() {
                return yB;
        }
}
