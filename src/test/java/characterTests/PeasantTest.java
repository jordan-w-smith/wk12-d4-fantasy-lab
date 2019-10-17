package characterTests;

import characters.Peasant;
import items.Sword;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeasantTest {

    Peasant peasant;
    Sword sword;
    Sword sword2;
    Weapon weapon;

    @Before
    public void before() {
        sword = new Sword(3);
        sword2 = new Sword(3);
        peasant = new Peasant("Pat", sword2, 50);

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
    public void hasHealth() {
        assertEquals(50, peasant.getHealth());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword2, peasant.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        peasant.changeWeapon(sword2);
        assertEquals(sword2, peasant.getWeapon());
    }

    @Test
    public void canAttack() {
        assertEquals("Pat attacks with Sword and deals 3 points of damage" , peasant.attack());
    }

    @Test
    public void healthGoesDownWhenAttacked() {
        peasant.receivesAttack(3);
        assertEquals(47, peasant.getHealth());
    }

    @Test
    public void givesCommentaryWhenAttacked() {
        assertEquals("AAAAHH. Pat has lost 3 health points. Down to 47 health points.", peasant.receivesAttack(3));
    }



}
