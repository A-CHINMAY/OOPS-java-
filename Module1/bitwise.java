package Module1;
public class bitwise {
    public static void main(String[] args) {
        int number = 5;    // Binary: 0000 0101
        int negativeNumber = -20; // Binary: 1111 1100

        // Left Shift (<<)
        int leftShift = number << 2; // Shift left by 2 positions
        System.out.println("Left Shift (5 << 2): " + leftShift); // Output: 20

        // Right Shift (>>)
        int rightShift = negativeNumber >> 2; // Shift right by 2 positions
        System.out.println("Right Shift (-20 >> 2): " + rightShift); // Output: -5

        // Unsigned Right Shift (>>>)
        int unsignedRightShift = negativeNumber >>> 2; // Unsigned shift right by 2 positions
        System.out.println("Unsigned Right Shift (-20 >>> 2): " + unsignedRightShift); // Output: 1073741821
    }
}
    
/*
 * Left Shift (<<):
 * 
 * Shifts all bits to the left by the specified number of positions.
 * Each left shift is equivalent to multiplying the number by
 * 2
 * 𝑛
 * 2
 * n
 * .
 * In this example, 5 << 2 shifts 5 (which is 0000 0101 in binary) to 0001 0100,
 * resulting in 20.
 * Right Shift (>>):
 * 
 * Shifts all bits to the right by the specified number of positions.
 * For negative numbers, it preserves the sign bit (arithmetic shift).
 * In this example, -20 >> 2 results in -5 since the sign bit is retained.
 * Unsigned Right Shift (>>>):
 * 
 * Shifts bits to the right, filling the leftmost bits with zeros regardless of
 * the sign.
 * This is useful for treating numbers as unsigned.
 * In this example, -20 >>> 2 results in 1073741821, which represents the binary
 * value after shifting.
 */
