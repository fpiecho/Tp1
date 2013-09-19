package ar.fiuba.tecnicas.giledrose;

public class OrdinaryItem extends ItemWrapper {

	public OrdinaryItem(String name, int sellIn, int quality){
		this.item = new Item(name, quality, sellIn);	
	}
	
	public OrdinaryItem(Item item){
		this.item = item;
	}

	protected void updateSellin(){
		this.item.setSellIn(this.item.getSellIn() -1);
		if(this.item.getSellIn() < 0 && this.item.getQuality() > 0)
			this.addToQuality(-1);
	}
	
	protected void updateQuality(){
		if(this.item.getQuality() > 0)
			this.addToQuality(-1);		
	}
}
