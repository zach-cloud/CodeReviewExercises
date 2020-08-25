package project2.fixed;

public class IsBetween {

    /**
     * Determines if the number is between high and low.
     * Inclusive.
     *
     * @param number    Number to check
     * @param high      High bound
     * @param low       Low bound
     * @return          True if number is between high and low bound; false if not.
     */
    public static boolean isBetween(int number, int high, int low) {
        return (number >= low && number <= high);
    }
}
