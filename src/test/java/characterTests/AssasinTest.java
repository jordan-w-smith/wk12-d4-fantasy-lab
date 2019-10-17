package characterTests;

import characters.Assassin;
import items.Axe;
import items.Sword;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssasinTest {
    Weapon sword;
    Weapon sword2;
    Weapon axe;
    Assassin assassin;

    @Before
    public void before() {
        sword = new Sword(3);
        sword2 = new Sword(3);
        axe = new Axe(30);
        assassin = new Assassin("Adrian", axe, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Adrian", assassin.getName());
    }

    @Test
    public void hasWeapon() {
        assertEquals(axe, assassin.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        assassin.changeWeapon(sword);
        assertEquals(sword, assassin.getWeapon());
    }

    @Test
    public void canAttack() {
        assertEquals("Adrian attacks with Axe and deals 30 points of damage" , assassin.attack());
    }
}
