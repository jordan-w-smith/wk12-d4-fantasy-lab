package characterTests;

import characters.Peasant;
import items.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeasantTest {

    Peasant peasant;
    Sword sword;
    Sword sword2;

    @Before
    public void before() {
        peasant = new Peasant("Pat", sword, 50);
        sword = new Sword(3);
        sword2 = new Sword(3);

    }

    @Test
    public void hasName() {
        assertEquals("Pat", peasant.getName());
    }

//    @Test
//    public void inventoryStartsAt0() {
//        assertEquals(0, peasant.countItems());
//    }

    @Test
    public void canChangeItem() {
        peasant.changeItem(sword2);
        assertEquals(sword2, peasant.getItem());
    }


}
