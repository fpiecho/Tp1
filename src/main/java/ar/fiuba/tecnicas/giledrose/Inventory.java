package ar.fiuba.tecnicas.giledrose;

import java.awt.List;
import java.util.LinkedList;

public class Inventory {
	public static final String CONJURED_ITEM = "Conjured Mana Cake";
	public static final String BACKSTAGE_ITEM = "Backstage passes to a TAFKAL80ETC concert";
	public static final String SULFURAS_ITEM = "Sulfuras, Hand of Ragnaros";
	public static final String AGED_BRIE_ITEM = "Aged Brie";
	public static final String DEXTERITY_ITEM = "+5 Dexterity Vest";
	public static final String ELIXIR_ITEM = "Elixir of the Mongoose";

	
    private LinkedList<ItemWrapper> itemwrappers;

    public Inventory(Item[] items) {
        super();
        this.itemwrappers = new LinkedList<ItemWrapper>();
        for (int i = 0; i < items.length; i++) {
        	if(items[i].getName() == CONJURED_ITEM || items[i].getName() == ELIXIR_ITEM || items[i].getName() == DEXTERITY_ITEM)
        		itemwrappers.add(new OrdinaryItem(items[i]));
        	else if (items[i].getName() == SULFURAS_ITEM )
        		itemwrappers.add(new Sulfuras(items[i]));
        	else if (items[i].getName() == BACKSTAGE_ITEM)
        		itemwrappers.add(new BackstagePass(items[i]));
        	else if (items[i].getName() == AGED_BRIE_ITEM)
        		itemwrappers.add(new AgedBrie(items[i]));
        }
        
    }

    public Inventory() {
        super();
        itemwrappers = new LinkedList<ItemWrapper>();
        itemwrappers.add(new OrdinaryItem(DEXTERITY_ITEM, 10, 20));
        itemwrappers.add(new AgedBrie(2, 0));
        itemwrappers.add(new OrdinaryItem(ELIXIR_ITEM, 5, 7));
        itemwrappers.add(new Sulfuras(80));
        itemwrappers.add(new BackstagePass(15, 20));
        itemwrappers.add(new OrdinaryItem(CONJURED_ITEM, 3, 6));

    }

    public void updateQuality() {
        for (int i = 0; i < itemwrappers.size(); i++) {
        	itemwrappers.get(i).update();
        }
    }
}
