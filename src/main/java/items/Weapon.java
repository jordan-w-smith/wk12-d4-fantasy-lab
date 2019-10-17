package items;


public abstract class Weapon extends Item {

    public int damage;

    public Weapon(int damage) {
        this.damage = damage ;
    }

    public int getDamage() {
        return damage;
    }


}
