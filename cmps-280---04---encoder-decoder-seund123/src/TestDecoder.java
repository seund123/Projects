import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestDecoder {

  @Test
  @DisplayName("Should return string from an array of integers representing the ASCII code of each character of the string.")
  public void testDecode()
  {
    Decoder d = new Decoder();

    int[] a = {65, 66, 67};
    String m = d.decode(a);
    assertEquals("ABC", m);

    m = d.decode(a, 0);
    assertEquals("ABC", m);
  }
  @Test
  @DisplayName("Should return string from an array of integers (minus the offset) representing the ASCII code of each character of the string.")
  public void testDecodeWithOffset()
  {
    Decoder d = new Decoder();

    int[] a = {75, 76, 77};
    String m = d.decode(a, 10);
    assertEquals("ABC", m);

    int[] b = {55, 56, 57};
    m = d.decode(b, -10);
    assertEquals("ABC", m);
  }
}