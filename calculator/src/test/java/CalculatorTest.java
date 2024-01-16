import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //arrange
        Calculator calc = new Calculator();

        //act
        double result = calc.add(2, 2);

        //assert
        assertEquals(4, result);
    }

    @Test
    void subtract() {
        //arrange
        Calculator calc = new Calculator();

        //act
        double result = calc.subtract(2, 2);

        //assert
        assertEquals(0, result);
    }

    @Test
    void multiply() {
        //arrange
        Calculator calc = new Calculator();

        //act
        double result = calc.multiply(2, 2);

        //assert
        assertEquals(4, result);
    }

    @Test
    void divide() {
        //arrange
        Calculator calc = new Calculator();

        //act
        double result = calc.divide(2, 2);

        //assert
        assertEquals(1, result);
    }
}