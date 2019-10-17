package characters;

import behaviours.IAttack;
import items.Item;

import items.Weapon;

public abstract class Character {
    String name;
    Weapon weapon;
    int health;

    public Character(String name, Weapon weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public Item getWeapon() {
        return this.weapon;
    }

    public int getWeaponDamage() {
        return this.weapon.getDamage();
    }

    public String attack() {
        return this.name + " attacks with " + this.weapon.getClass().getSimpleName() + " and deals " + getWeaponDamage() + " points of damage";
    }



//    public int receivesAttack(int damage) {
//        return this.health -= damage;
//    }

        public String receivesAttack(int damage) {
        this.health -= damage;
        return "AAAAHH. " + this.name + " has lost " + damage + " health points. Down to " + this.health + " health points.";
    }


}
