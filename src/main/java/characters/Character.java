package characters;

import behaviours.IAttack;
import items.Item;

import java.util.ArrayList;

public abstract class Character implements IAttack {
    String name;
    Item item;
    int health;

    public Character(String name, Item item, int health) {
        this.name = name;
        this.item = item;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

//    public int countItems(){
//        return this.items.size();
//    }

    public void changeItem(Item newItem) {
        this.item = newItem;
    }

    public Item getItem() {
        return this.item;
    }

    public String attack() {
        return "Player attacks";
    }




}
