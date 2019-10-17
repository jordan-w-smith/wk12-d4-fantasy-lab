package characters;

import java.util.ArrayList;

public abstract class Character {
    String name;
    ArrayList<Item> items;


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


}
