package ar.fiuba.tecnicas.giledrose;

public class DexterityVest extends ItemWrapper{
	
	public DexterityVest(int sellIn, int quality ){
		this.item = new Item("+5 Dexterity Vest", quality, sellIn);	
	}

	protected void updateSellin(){
		this.item.setSellIn(this.item.getSellIn() -1);
	}
	
	protected void updateQuality(){
		if(this.item.getQuality() > 0)
			this.addToQuality(-1);		
		if(this.item.getSellIn() < 0)
			this.addToQuality(-1);
	}
}
