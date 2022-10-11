import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestEncoder {

  @Test
  @DisplayName("Should return array of integers with ASCII code of each character in the string.")
  public void testEncode()
  {
    Encoder e = new Encoder();

    int[] a = e.encode("ABC");
    assertEquals(65, a[0]);
    assertEquals(66, a[1]);
    assertEquals(67, a[2]);

    int[] b = e.encode("ABC", 0);
    assertEquals(65, b[0]);
    assertEquals(66, b[1]);
    assertEquals(67, b[2]);
  }
  @Test
  @DisplayName("Should return array of integers with ASCII code of each character in the string with added offset.")
  public void testEncodeWithOffset()
  {
    Encoder e = new Encoder();

    int[] a = e.encode("ABC", 10);
    assertEquals(75, a[0]);
    assertEquals(76, a[1]);
    assertEquals(77, a[2]);

    int[] b = e.encode("ABC", -10);
    assertEquals(55, b[0]);
    assertEquals(56, b[1]);
    assertEquals(57, b[2]);
  }
}