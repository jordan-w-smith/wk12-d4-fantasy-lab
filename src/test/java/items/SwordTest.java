package items;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwordTest {

    Sword sword;
    @Before
    public void before() {
        sword = new Sword(3);
    }

    @Test
    public void hasDamage() {
        assertEquals(3, sword.getDamage());
    }



}
