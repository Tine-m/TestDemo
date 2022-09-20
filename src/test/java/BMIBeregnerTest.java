import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BMIBeregnerTest {

  @Test
  public void beregnBMI() {
    //Arrange
    BMIBeregner beregner = new BMIBeregner();
    double expected = 23.1;
    //Act
    double actual = beregner.beregnBMI(75,1.8);

    //Assert
    assertEquals(expected,actual,1);
  }
}