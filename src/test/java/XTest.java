import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class XTest {

  @Test
  public void erSandSand() {
    assertTrue(2>1);
  }

  @Test
  public void erFalskFalsk() {
    assertFalse(1==2);
  }
}