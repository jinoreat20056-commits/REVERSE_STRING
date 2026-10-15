import org.junit.Test;
import static org.junit.Assert.*;
public class StringReverserTest {
    private final StringReverser obj = new StringReverser();
    @Test public void normal() { assertEquals("olleh", obj.reverse("hello")); }
    @Test public void single() { assertEquals("a", obj.reverse("a")); }
    @Test public void empty() { assertEquals("", obj.reverse("")); }
    @Test public void spaces() { assertEquals("c b a", obj.reverse("a b c")); }
}
