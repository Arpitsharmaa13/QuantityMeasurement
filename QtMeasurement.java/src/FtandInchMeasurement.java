/**
 * QuantityMeasurementApp
 *
 * UC2: Equality check for Feet and Inches separately
 *
 * @author Arpit Sharma
 * @version 1.1
 */

public class FtandInchMeasurement {

    // ================= FEET CLASS =================
    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // ================= INCH CLASS =================
    static class Inch {
        private final double value;

        public Inch(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Inch other = (Inch) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // ================= STATIC METHODS =================

    public static boolean compareFeet(double a, double b) {
        Feet f1 = new Feet(a);
        Feet f2 = new Feet(b);
        return f1.equals(f2);
    }

    public static boolean compareInch(double a, double b) {
        Inch i1 = new Inch(a);
        Inch i2 = new Inch(b);
        return i1.equals(i2);
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        boolean feetResult = compareFeet(1.0, 1.0);
        boolean inchResult = compareInch(12.0, 12.0);

        System.out.println("Feet Comparison (1.0 vs 1.0): " + feetResult);
        System.out.println("Inch Comparison (12.0 vs 12.0): " + inchResult);
    }
}
