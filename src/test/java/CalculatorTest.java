import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  Calculator calculator;

  @BeforeEach
  public void setup() {
    calculator = new Calculator();
  }

  @Test
  public void addPositiveIntegers() {
    //Arrange
    int expected = 30;
    //Act
    int actual = calculator.add(10, 20);
    //Assert
    assertEquals(expected, actual);
  }

  @Test
  public void addNegativenumbers() {
    //Arrange
    int expected = -30;
    //Act
    int actual = calculator.add(-10, -20);
    //Assert
    assertEquals(expected, actual);
  }

  @Test
  public void addBigIntegersShouldFail() {
    //Act + Assert
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
    });
  }

}