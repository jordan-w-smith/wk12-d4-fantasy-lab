package characters;

import items.Item;

import java.util.ArrayList;

public abstract class Character {
    String name;
    ArrayList<Item> items;
    Item item;

    public Character(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return this.name;
    }

    public int countItems(){
        return this.items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }


}
