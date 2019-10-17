package characterTests;

import characters.King;
import items.Sword;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KingTest {

    Weapon sword;
    Weapon sword2;
    King king;

    @Before
    public void before() {
        sword = new Sword(3);
        sword2 = new Sword(3);
        king = new King("Klaude", sword, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Klaude", king.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, king.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        king.changeWeapon(sword2);
        assertEquals(sword2, king.getWeapon());
    }

    @Test
    public void canAttack() {
        assertEquals("Klaude attacks with Sword and deals 3 points of damage" , king.attack());
    }
}
