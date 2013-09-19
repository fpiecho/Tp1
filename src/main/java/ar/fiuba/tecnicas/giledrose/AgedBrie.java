package ar.fiuba.tecnicas.giledrose;


public class AgedBrie extends ItemWrapper{
	
	public AgedBrie(int sellIn, int quality){
		this.item = new Item("Aged Brie", quality, sellIn);	
	}
	
	public AgedBrie(Item item){
		this.item = item;
	}

	protected void updateSellin(){
		this.item.setSellIn(this.item.getSellIn() -1);
		if(this.item.getQuality() < 50 && this.item.getSellIn() < 0)
			this.addToQuality(1);
	}
	
	protected void updateQuality(){
		if(this.item.getQuality() < 50)
			this.addToQuality(1);		
	}
}
