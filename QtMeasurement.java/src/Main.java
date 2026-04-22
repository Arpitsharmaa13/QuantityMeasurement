/**
 * QuantityMeasurementApp
 *
 * This class demonstrates equality comparison of two measurements in feet.
 * It uses an inner class Feet with proper equals() implementation.
 *
 * @author Arpit Sharma
 * @version 1.0
 */

public class Main {

    // Inner class representing Feet measurement
    static class Feet {

        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {

            // Same reference check
            if (this == obj) {
                return true;
            }

            // Null and type check
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            // Type casting
            Feet other = (Feet) obj;

            // Compare using Double.compare
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Main method
    public static void main(String[] args) {

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Comparing 1.0 ft and 1.0 ft");
        System.out.println("Result: " + result);
    }
}