package Lektion16.Ubung2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myCalculatorTest {
    @Test
    public void testGetChange() {
        ChangeCalculator calculator = new myCalculator();

        // Test 1: 5.67 Euro
        int[] result = calculator.getChange(5, 67);
        int[] expected = {2, 1, 1, 0, 1, 1, 1, 0}; // 2x2€, 1x1€, 1x50¢, 1x10¢, 1x5¢, 2x1¢
        assertArrayEquals(expected, result);

        // Test 2: 0.99 Euro
      int[]  result2 = calculator.getChange(0, 99);
       int[] expected1 = {0, 0, 1, 2, 0, 1, 2, 0}; // 1x50¢, 1x20¢, 1x5¢, 2x2¢
        assertArrayEquals(expected1, result2);

        // Test 3: 2.00 Euro
        int[] result3 = calculator.getChange(2, 0);
        int[] expected2 = {1, 0, 0, 0, 0, 0, 0, 0}; // 1x2€
        assertArrayEquals(expected2, result3);
    }

}