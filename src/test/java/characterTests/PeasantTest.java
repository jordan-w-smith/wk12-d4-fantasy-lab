package characterTests;

import characters.Peasant;
import items.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeasantTest {

    Peasant peasant;
    Sword sword;

    @Before
    public void before() {
        peasant = new Peasant("Pat");
        sword = new Sword(3);

    }

    @Test
    public void hasName() {
        assertEquals("Pat", peasant.getName());
    }

    @Test
    public void inventoryStartsAt0() {
        assertEquals(0, peasant.countItems());
    }


}
